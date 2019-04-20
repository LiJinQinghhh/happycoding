public class Flight {
	private String flightName;          //������
	private int row;                    //��λ����
	private int rowLength;              //ÿ����λ��
	private int[] fail= {-1};           //����Ԥ����
	private Passenger[] passengerList;  //Ԥ����λ���ÿ�


	public Flight(String FlightName, int rows, int rowLength) throws Exception {
		// TODO Auto-generated constructor stub
		if(FlightName==null || FlightName.trim().length()==0 || rows<=0 || rowLength<=0)
			throw new Exception("error!!");
		else {
			this.flightName=FlightName;
			this.row=rows;
			this.rowLength=rowLength;
			this.passengerList=new Passenger[row*rowLength];  //����������λ
			for(int i=0;i<row*rowLength;i++)
				passengerList[i]=null;                       //������λû�б�Ԥ��
		}
}
	
	public int[] reserve(String[] names) {
		if(names.length>rowLength)
			return fail;
		int i=0,j=0,k=0;
		boolean flag=false;
		labelA:for(i=0;i<=row-1;i++) {
			for(j=0;j<=rowLength-names.length;j++) {
				for(k=j;k<=j+names.length-1;k++) {          //�ڱ��д�j��j+names.length-1�ҿ���λ
					if(passengerList[i*rowLength+k]!=null)
						break;
				}
				if(k>j+names.length-1) {                //���ҵ����ӵ�i�е�j�п�ʼ
					flag=true;                          //�������ҵ����
					break labelA;                       //�˳�����ѭ��
				}
			}
		}
		if(!flag)
			return fail;
		int[] bn = new int[names.length];            //ÿ���ÿͷ���һ��Ԥ����
		for(k=j;k<=j+names.length-1;k++) {
			bn[k-j]=i*rowLength+k+1;                //����Ԥ���ţ�name[0]��Ӧbn[0]
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
