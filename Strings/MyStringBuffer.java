package Strings;

public class MyStringBuffer {
    public static void main(String[] args) {

        long startTime = System.currentTimeMillis();
        StringBuffer buffer = new StringBuffer("dssd");
        System.out.println(buffer.capacity());
//        buffer.append(" Jandu");
//        System.out.println(buffer);
        for(int i = 0; i < 10000; i++){
            buffer.append("world");
        }
        System.out.println("time Taken By String buffer : "+ (System.currentTimeMillis()- startTime));

        StringBuilder builder = new StringBuilder("Hello ");
        System.out.println(builder.capacity());
        builder.append(" Chaman Lala");
        System.out.println(builder);

        for(int i = 0; i < 10000; i++){
            buffer.append("world");
        }
        System.out.println("time Taken By String BUILDER : "+ (System.currentTimeMillis()- startTime));
    }
}