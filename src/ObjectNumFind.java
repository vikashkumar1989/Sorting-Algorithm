
public class ObjectNumFind {
	
	public static int i=0;
	public static int j=0;
	public ObjectNumFind() {
		i=i+1;
	}
	static {
		j++;
	}

	public static void main(String[] args) {
		ObjectNumFind obj1=new ObjectNumFind();
		ObjectNumFind obj2=new ObjectNumFind();
		ObjectNumFind obj3=new ObjectNumFind();
		ObjectNumFind obj4=new ObjectNumFind();
		ObjectNumFind obj5=new ObjectNumFind();
		System.out.println("Created Object number is :"+ObjectNumFind.i);
		System.out.println("number of static block executed:"+ObjectNumFind.j);

	}

}
