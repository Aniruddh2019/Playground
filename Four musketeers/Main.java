 #include<iostream>
int main()
{
  float x1,x2,x3,y1,y2,y3,result1,result2;

  std::cin>>x1;
  
  std::cin>>y1;
  
  std::cin>>x2;
  
  std::cin>>y2;
 
  std::cin>>x3;
  std::cin>>y3;
  result1=float(x1+x2+x3)/3;
  result2=float(y1+y2+y3)/3;
  std::cout<<result1;
  std::cout<<"\n";
   std::cout<<result2;
  
  return 0;
}
  