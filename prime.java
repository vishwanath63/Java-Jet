class prime{
  public static void main(String[]args){
    Scanner s = new Scanner(System.in);
    int num = s.nextInt();
    if(num==0||num==1)
      System.out.println("Not A Prime");
     else
     {
      for(int i=2;i<num/2;i++)
      {
        if(num%i==0)
        System.out.println("Not A Prime");
        int flag =1;
        break;
      }
      }
      if(flag==0)
      System.out.println("IS A Prime");
  }
}
