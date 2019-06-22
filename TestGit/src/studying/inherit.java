package studying;

import java.util.Arrays;

public class inherit{
	public static void main(String[] args) {
		System.out.println("-----------国产+进口化妆品--------------------");
		cosmeticManeger cm=new cosmeticManeger();
	    cm.add(new cosmetic("YSL","进口",320));
	    cm.add(new cosmetic("Dior","进口",999));
		cm.add(new cosmetic("Chanel","进口",1000));
		cm.add(new cosmetic("大宝","国产",15));
		cm.add(new cosmetic("完美日记","国产",79));
		cm.printInfo();
		System.out.println("-----------进口化妆品--------------------");
		importcosmeticManeger cm1=new importcosmeticManeger();
	    cm1.add(new cosmetic("YSL","进口",320));
	    cm1.add(new cosmetic("Dior","进口",999));
		cm1.add(new cosmetic("Chanel","进口",1000));
		cm1.add(new cosmetic("大宝","国产",15));
		cm1.add(new cosmetic("完美日记","国产",79));
		cm1.printInfo();
		System.out.println("-----------按价格从低到高--------------------");
		SortcosmeticManeger cm2=new SortcosmeticManeger();
	    cm2.add(new cosmetic("YSL","进口",320));
	    cm2.add(new cosmetic("Dior","进口",999));
		cm2.add(new cosmetic("Chanel","进口",1000));
		cm2.add(new cosmetic("大宝","国产",15));
		cm2.add(new cosmetic("完美日记","国产",79));
		cm2.printInfo();
	
	}
}
class SortcosmeticManeger extends cosmeticManeger{
	public void printInfo() {
		cosmetic[] temp=Arrays.copyOf(cs,count);//复制数组
		cosmetic c=null;
		for(int i=0;i<count-1;i++) {
			for(int j=0;j<count-i-1;j++) {
				if(temp[j].getPrice()>temp[j+1].getPrice()) {
					c=temp[j];
					temp[j]=temp[j+1];
					temp[j+1]=c;
				}
			}
		}for(cosmetic c1:temp) {
			System.out.println(c1.getInfo());
		}
	}
}
class importcosmeticManeger extends cosmeticManeger{
	
	public void printInfo() {
		for(int i=0;i<count;i++) {
			if("进口".equals(cs[i].getType())) {
				System.out.println(cs[i].getInfo());
			}
		}
	}
	
	
}
class cosmeticManeger{
	protected cosmetic[] cs=new cosmetic[4];
	protected int count=0;
	//进货功能（方法）
	public void add(cosmetic c) {
		int size=cs.length;
		if(count>=size) {
			int newlen=size*2;
			cs=Arrays.copyOf(cs, newlen);
		}
		cs[count]=c;
		count++;
	}
	//输出所有产品
	public void printInfo() {
		for(int i=0;i<count;i++) {
			System.out.println(cs[i].getInfo());
			
		}
	}
}
class cosmetic{
	public cosmetic() {
		
	}
	public cosmetic(String name,String type,int price) {
		this.name=name;
		this.type=type;
		this.price=price;
	}
	private String name;//化妆品的品牌
	private String type;//进口或者国产
	private int price;//价格
	public void setName(String name) {
		this.name=name;
	}
	public String getName() {
		return name;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getInfo() {
		return "品牌："+name+",产品类型："+type+",价格："+price;
	} 
}