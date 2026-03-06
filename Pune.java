public Stream<Integer> m1()
{
	System.out.println("m1 method exeuted...");
	Stream<Integer> stream1=Stream.of(6,2,5,7,8);
	return stream;
}
public Stream<String> m2()
{
		System.out.println("m2 method exeuted...");
		String[] str=new String[]{"Tenu","Pannu","Ranuu","Titli"};
		Stream<String> stream2=Arrays.stream(str);
        return stream2;
}