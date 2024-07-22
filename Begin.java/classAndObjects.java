class Nokia{
    private int mic ;
    private int cam;
    void setValue(){
         System.out.println(mic);
    }
    void setDisplay(){
        System.out.println(cam);
    }
}
class classAndObjects{
    public static void main(String[] args){
        Nokia nok = new Nokia();
        nok.setValue();
        System.out.println();
    }
}
