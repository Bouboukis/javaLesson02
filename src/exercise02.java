class exercise02 {
    public static void main(String[] args) {

        byte b1 = 1;
        byte b2 = 2;
    //  byte b =b1+b2; This code will not work. Java converts byte,sort and char variables to int to do the calculations
        byte b = (byte)(b1 + b2);
        System.out.println(b);
    }
}
