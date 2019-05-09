public interface FlightInterface {
	public int[ ] reserve(String names);       //预订航班座位
	public boolean cancel(int bokingNumber);   //取消预订座位
	public Passenger[] getPsaaengerList();     //返回旅客列表

}
