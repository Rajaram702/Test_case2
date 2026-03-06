public int m1()
{
	System.out.println("m1 method exeuted...");
	return 15;
}
public Stream<String> m2()
{
		System.out.println("m2 method exeuted...");
		String[] str=new String[]{"Tenu","Pannu","Ranuu"};
		Stream<String> stream2 =Arrays.stream(str);
        return stream2;
}