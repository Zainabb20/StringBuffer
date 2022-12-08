//String Buffer - A class used to create mutable String objects.
// This is thread safe

public class Main
{
    public static void main(String[] args)
    {
       StringBuffer sb= new StringBuffer("Hello");
       sb.append("StringBufferClass"); //appends the passed string
        System.out.println(sb);
       sb.insert(5,"Java");   //insert at the mentioned index
        System.out.println(sb);
       sb.replace(2,5,"y World"); //replace between the mentioned start and end index
        System.out.println(sb);
        sb.delete(1,5);
        System.out.println(sb);
        sb.reverse();
        System.out.println(sb);
        System.out.println(sb.capacity());

        //capacity of the buffer - default capacity is 16
        //if number of character increases - (old capacity*2)+2
        StringBuffer bs=new StringBuffer("Woo");
        System.out.println(bs.capacity());
        bs.append("Woo Woo Woo Woo");
        System.out.println(bs.capacity());

        //ensure capacity - passes the minimum capacity as an argument, the capacity should be that minimum

        StringBuffer sbb= new StringBuffer("Hey");
        System.out.println("Capacity of Hey:" +sbb.capacity());
        sbb.append("!! Welcome to the World");
        System.out.println("Capacity after Appending:" +sbb.capacity());
        sbb.ensureCapacity(20);
        System.out.println("Capacity when minimum capacity is 20:" +sbb.capacity());
        sbb.append(" Mohan");
        System.out.println("Appended String:" +sbb);
        System.out.println("Capacity after Appending:" +sbb.capacity());
        sbb.ensureCapacity(114);
        System.out.println("Capacity when minimum capacity is 54:" +sbb.capacity());


    }
}