class overloading{
    void add(int a,int b){
        System.out.println(a+b);
    }
    void add(int a,int b,int c){
        System.out.println(a+b+C);
    }
    public static void main(String args[]){
        mulitlevel obj = new mulitlevel();
        obj.add(10,20);
        obj.add(10,20,30);
    }
}
