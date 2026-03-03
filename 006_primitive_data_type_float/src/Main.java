//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {


    double maxFloat=Float.MAX_VALUE;
    float minFloat=Float.MIN_VALUE;
    System.out.println("min and max values float");

    System.out.println(minFloat);
    System.out.println(maxFloat);

    int x=9/2;


    System.out.printf("%.9f \n",maxFloat);

    System.out.println(x);

    boolean var=true;
    System.out.println(var);

    char a='\u00A7';
    System.out.println(a);


    String s1="this is atul string";
    String s2=" this is another string";
    System.out.println(s1+s2);

    short shortValue=12;
    byte bytValue=(byte)shortValue;
    System.out.println(bytValue);


    //arithmetic operators


    int xxx=3;
    switch (xxx){
        case 1-> System.out.println("hello "+1);
        case 2-> System.out.println("hii "+2);
        case 3-> System.out.println("bye "+3);
        default -> System.out.println("tata");
    }

    int arr[]={1,2,3,4,5};
    for(int xy:arr){
        System.out.println(xy);
    }

    //sum of digits

    int digit=1284848;


    int sumDigit=0;
    System.out.println("***************");
    do{
        System.out.println(sumDigit+" - "+digit);
        sumDigit+=digit%10;
        digit=digit/10;

    }
    while(digit>0);

    System.out.println("*************");
    System.out.println(sumDigit);
    System.out.println("*****************");
    System.out.println(0b010110101010);


}


