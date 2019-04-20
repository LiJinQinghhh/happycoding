public class Flight {
	private String flightName;          //航班名
	private int row;                    //座位排数
	private int rowLength;              //每排座位数
	private int[] fail= {-1};           //返回预定号
	private Passenger[] passengerList;  //预定座位的旅客


	public Flight(String FlightName, int rows, int rowLength) throws Exception {
		// TODO Auto-generated constructor stub
		if(FlightName==null || FlightName.trim().length()==0 || rows<=0 || rowLength<=0)
			throw new Exception("error!!");
		else {
			this.flightName=FlightName;
			this.row=rows;
			this.rowLength=rowLength;
			this.passengerList=new Passenger[row*rowLength];  //创建航班座位
			for(int i=0;i<row*rowLength;i++)
				passengerList[i]=null;                       //所有座位没有被预定
		}
}
	
	public int[] reserve(String[] names) {
		if(names.length>rowLength)
			return fail;
		int i=0,j=0,k=0;
		boolean flag=false;
		labelA:for(i=0;i<=row-1;i++) {
			for(j=0;j<=rowLength-names.length;j++) {
				for(k=j;k<=j+names.length-1;k++) {          //在本行从j到j+names.length-1找空座位
					if(passengerList[i*rowLength+k]!=null)
						break;
				}
				if(k>j+names.length-1) {                //已找到，从第i行第j列开始
					flag=true;                          //设置已找到标记
					break labelA;                       //退出整个循环
				}
			}
		}
		if(!flag)
			return fail;
		int[] bn = new int[names.length];            //每个旅客返回一个预定号
		for(k=j;k<=j+names.length-1;k++) {
			bn[k-j]=i*rowLength+k+1;                //产生预定号，name[0]对应bn[0]
			passengerList[i*rowLength+k]=new Passenger(names[k-j],i*rowLength+k+1,i,k);
		}
		return bn;
	}
	public boolean cancel(int bookingNumber) {
		boolean Status=false;
		for(int i=0;i<row*rowLength;i++) {
			if(passengerList[i]!=null && bookingNumber==passengerList[i].getBookingNumber()) {
				Status=true;
				passengerList[i]=null;
				break;
			}
		}
		return Status;
	}
	public Passenger[] getPassengerList() {
		return passengerList;
	}

}
