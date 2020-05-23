#include<iostream>
int main()
{
  int a,b,c,result;
  std::cout<<"Enter first number :";
  std::cin>>a;
  std::cout<<" Enter second number :";
  std::cin>>b;
  std::cout<<" Menu";
  std::cin>>c;
  std::cout<<"\n";
  std::cout<<"1.Addition";
   std::cout<<"\n";
   std::cout<<"2.Subtraction";
   std::cout<<"\n";
   std::cout<<"3.Multiplication";
   std::cout<<"\n";
   std::cout<<"4.Division";
   std::cout<<"\n";
   std::cout<<"5.Remainder";
   std::cout<<"\n";
  switch(c)
  {
    case 1:
      result=a+b;
      std::cout<<result;
      break;
    case 2:
      result=a-b;
      std::cout<<result;
      break;
    case 3:
      result=a*b;
      std::cout<<result;
      break;
    case 4:
      result=a/b;
      std::cout<<result;
      break;
    case 5:
      result=a%b;
      std::cout<<result;
      break;
    default:
      std::cout<<"Invalid operation";
      break;
  }
}
      