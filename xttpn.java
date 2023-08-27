class xttpn {
    public static int calcpow(int x,int n){
     if(n==0)return 1;
     if(x==0)return 0;
        int xtpn=calcpow(x, n-1);
        int xpn=x*xtpn;
        return xpn;
    }
    public static void main(String[] args){
        int x=2,n=5;
        int j=calcpow(x, n);
        System.out.println(j);
    }
}
