
import java.io.*;
class Main
 {
     public static void main(String args[]) throws IOException
       {
           BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
           System.out.println();

           System.out.println("      __ M A I N  M E N U__    ");
           System.out.println();
          
           System.out.println("1.  N U M B E R  S Y S T E M ");
           
           System.out.println();
           System.out.println("2.  S E R I E S ");
          
           System.out.println();
           System.out.println("3.  P A T T E R N S ");
          
           System.out.println();
           System.out.println("4.  S T R I N G  ");
           System.out.println();
           
           System.out.println("5.  A R R A Y ");
           
           System.out.println();
           System.out.println("Enter your choice");
           int ch=Integer.parseInt(stdin.readLine());
           System.out.println();
           System.out.println();
           switch (ch)
                    {
                        case 1:
                              
                        System.out.println("_S U B  M E N U_");
                        System.out.println();
                        
                        System.out.println("1. P R I M E  N U M B E R ");
                        System.out.println();
                        System.out.println("2. A R M S T R O N G  N U M B E R ");
                        System.out.println();
                        System.out.println("3. P E R F E C T  N U M B E R ");
                        System.out.println();
                        System.out.println("4. P A L I N D R O M E  N U M B E R ");
                        System.out.println();
                        System.out.println("5. D I S A R I U M  N U M B E R ");
                        System.out.println();
                        System.out.println("6. M A G I C  N U M B E R ");
                        System.out.println();
                        System.out.println("7. D U C K  N U M B E R ");
                        System.out.println();
                        System.out.println("8. H A R S H E D  N U M B E R ");
                        System.out.println();
                        System.out.println("9. S P Y  N U M B E R");
                        System.out.println();
                        System.out.println("10. T W I S T E D  P R I M E ");
                        System.out.println();
                        
                        System.out.println("Enter your choice");
                        int ch1=Integer.parseInt(stdin.readLine());
                        System.out.println();
                        switch(ch1)
                                 {
                                     case 1:
                                            System.out.println("Enter a number");
                                            int n = Integer.parseInt(stdin.readLine());
                                            int i=0,c=0;
                                            for(i=1;i<=n;i++)
                                            { 
                                                if(n%i==0)
                                                c++;
                                                
                                            }
                                            System.out.println();
                                            if(c==2)
                                            System.out.println(" It is a PRIME NUMBER");
                                            else
                                            System.out.println("It is not a PRIME NUMBER");
                                            
                                            break;
                                            
                                     case 2 : 
                                            System.out.println("Enter a number");
                                            n = Integer.parseInt(stdin.readLine());
                                             
                                              i=0;
                                              int r=0,s=0,dup=n;
                                             while(n!=0)
                                             {
                                                 r=n%10;
                                                 s=s+(r*r*r);
                                                 n=n/10;
                                                }
                                                System.out.println();
                                                if(dup==s)
                                                System.out.println("It is an ARMSTRONG NUMBER");
                                                else
                                                System.out.println("It is not an ARMSTRONG NUMBER");
                                                
                                            break;
                                            
                                     case 3 :
                                             System.out.println("Enter a number");
                                             n = Integer.parseInt(stdin.readLine());
                                             i=0;
                                             s=0;
                                             dup=n;
                                             for(i=1;i<=n;i++)
                                              {
                                                  if(n%i==0)
                                                  s=s+i;
                                                }
                                                System.out.println();
                                                if(s==2*dup)
                                                 System.out.println("It is a PERFECT NUMBER");
                                                 else
                                                 System.out.println("It is not a PERFECT NUMBER");                                          
                                                
                                            break;
                                      case 4:
                                              System.out.println("Enter a number");
                                              n = Integer.parseInt(stdin.readLine());
                                              i=0;
                                              int rev=0;
                                              dup=n;
                                              while(n!=0)
                                              {
                                                  r=n%10;
                                                  rev=rev*10+r;
                                                  n=n/10;
                                                }
                                               System.out.println();
                                               if(rev==dup)
                                                System.out.println("It is a PALINDROME NUMBER");
                                               else
                                                System.out.println("It is not a PALINDROME NUMBER");
                                              break;
                                      case 5:
                                              System.out.println("Enter a number");
                                              n = Integer.parseInt(stdin.readLine());
                                              c=0;
                                              dup=n;
                                              while(n!=0)
                                              {
                                                  c++;
                                                  n=n/10;
                                                }
                                                n=dup;
                                               s=0;
                                               int x=0;
                                               r=0;
                                                while(n!=0)
                                                {
                                                    r=n%10;
                                                    x=(int)Math.pow(r,c--);
                                                    s=s+x;
                                                    n=n/10;
                                                }
                                               System.out.println();
                                               if(dup==s)
                                                
                                                System.out.println("It is a DISARIUM NUMBER");
                                                else
                                                System.out.println("It is not a DISARIUM NUMBER");
                                              break;
                                       case 6:
                                              System.out.println("Enter a number");
                                              n = Integer.parseInt(stdin.readLine());
                                              System.out.println();
                                              s=0;
                                              for(;;)
                                              {
                                                  while(n!=0)
                                                  {
                                                      r=n%10;
                                                      s=s+r;
                                                      n=n/10;
                                                      }
                                                      if(s==1)
                                                      {
                                                       System.out.println("It is a MAGIC NUMBER");
                                                       break;
                                                    }
                                                    else if(s<=9)
                                                    {
                                                       System.out.println("It is not a MAGIC NUMBER");
                                                       break;
                                                    }
                                                    else
                                                    {
                                                        n=s;
                                                        s=0;
                                                    }
                                                }
                                                break;
                                        case 7:
                                              System.out.println("Enter a number");
                                              n = Integer.parseInt(stdin.readLine());
                                              System.out.println();
                                              r=0;
                                              int flag=0;
                                              while(n!=0)
                                              {
                                                  r=n%10;
                                                  if(r==0)
                                                  {
                                                      flag=1;
                                                      break;
                                                    }
                                                    n=n/10;
                                                }
                                                if(flag==1)
                                                System.out.println("It is a DUCK NUMBER");
                                                else
                                                System.out.println("It is not a DUCK NUMBER");
                                                break;
                                       case 8:
                                              System.out.println("Enter a number");
                                              n = Integer.parseInt(stdin.readLine());
                                              System.out.println();
                                              r=0;
                                              s=0;
                                              dup=n;
                                              while(n!=0)
                                              {
                                                  r=n%10;
                                                  s=s+r;
                                                  n=n/10;
                                                }
                                                if(dup%s==0)
                                                System.out.println("It is a HARSHED NUMBER");
                                                else
                                                System.out.println("It is not a HARSHED NUMBER");
                                                break;
                                       case 9:
                                              System.out.println("Enter a number");
                                              n = Integer.parseInt(stdin.readLine());
                                              System.out.println();
                                              s=0;
                                              r=0;
                                              int p=1;
                                              while(n!=0)
                                              {
                                                  r=n%10;
                                                  p=p*r;
                                                  s=s+r;
                                                  n=n/10;
                                                }
                                                if(p==s)
                                                System.out.println("It is a SPY NUMBER");
                                                else
                                                System.out.println("It is not a SPY NUMBER");
                                                break;
                                                
                                        case 10:
                                              System.out.println("Enter a number");
                                              n = Integer.parseInt(stdin.readLine());
                                              i=0;
                                             int j=0;
                                               s=0;
                                               c=0;
                                               r=0;
                                              int d=0;
                                              dup=n;
                                              s=0;
                                              for(i=1;i<=n;i++)
                                              {
                                                  if(n%i==0)
                                                  c++;
                                                }
                                                
                                                  while(dup!=0)
                                                  {
                                                      r=dup%10;
                                                      s=s*10+r;
                                                      dup=dup/10;
                                                    
                                                    }
                                                   for(j=1;j<=s;j++)
                                                   {
                                                       if(s%j==0)
                                                       d++;
                                                    }
                                                                    
                                                if((d==2)&&(c==2))
                                                System.out.println("It is a TWISTED PRIME");
                                                else
                                                System.out.println("It is not a TWISTED PRIME");
                                                
                                                break;
                                                  
                                            }
                                            break;
                                        
                                        
                        case 2:
                              
                        System.out.println("_S U B  M E N U_");
                        System.out.println();
                        
                        System.out.println("1. s = 1 + 12 + 123 + 1234 ... n terms");
                        System.out.println();
                        
                        System.out.println("2. s = 1/2 + 2/3 + 3/4 ... n terms ");
                        System.out.println();
                        System.out.println("3. s = (1+2)/(2*3) + (2+3)/(3*4) + (3+4)/(4*5) ... n terms");
                        System.out.println();
                        System.out.println("4. s = (1*2) + (2*3) + ... + (19*20)");
                        System.out.println();
                        System.out.println("5. s = (1+2)/(1*2) + (1+2+3)/(1*2*3) ... (1+2+3+...n)/(1*2*3*...n)");
                        System.out.println();
                        System.out.println("6. s = a + a/2! + a/3! ... a/n!");
                        System.out.println();
                        System.out.println("7. s = (a+1)/3 + (a+2)/5 + (a+3)/7 ... n  ");
                        System.out.println();
                        System.out.println("8. s = (a+1) + (a+2) + (a+3) ... (a+n) ");
                       System.out.println();
                       System.out.println("9. s = a/2 + a/5 + a/8 + a/11 ... a/20");
                       System.out.println();
                       System.out.println("10. s = a - (a^3)/5 + (a^5)/9 + (a^7)/13 ... n ");
                       System.out.println();
                       System.out.println("Enter your choice");
                        int ch2=Integer.parseInt(stdin.readLine());
                        System.out.println();
                        switch(ch2)
                                 {
                                     case 1:
                                            System.out.println("Enter value of n");
                                            int n = Integer.parseInt(stdin.readLine());
                                            System.out.println();
                                            int s=0,i=0;
                                             for(i=1;i<=n;i++)
                                            {
                                                s=s*10+i;
                                               
                                            }
                                            System.out.print(s);
                                            
                                            break;
                                            
                                     case 2 : 
                                            System.out.println("Enter value of n");
                                            n = Integer.parseInt(stdin.readLine());
                                            System.out.println();
                                            double s1=0.0; 
                                            double i1=0.0;  
                                             
                                             for(i1=1;i1<=n;i1++)
                                             {
                                               s1=s1+i1/(i1+1);
                                            }
                                             System.out.print(s1);    
                                                 
                                                
                                                
                                              
                                            break;
                                            
                                     case 3 :
                                             System.out.println("Enter value of n");
                                             n = Integer.parseInt(stdin.readLine());
                                            System.out.println();
                                            s1=0.0;
                                            i1=0.0;
                                             for(i1=1;i1<=n;i1++)
                                             {
                                                 s1=s1+(i1+(i1+1))/((i1+1)*(i1+2));
                                                }
                                                System.out.print(s1);
                                             
                                                  break;
                                             
                                          
                                      case 4:

                                              s=0;
                                              i=0;
                                              for(i=1;i<=19;i=i+1)
                                              {
                                                  s=s+(i*(i+1));
                                                }
                                                System.out.print(s);
                                              
                                              break;
                                              
                                            
                                                    
                                                    
                                            
                                      case 5:
                                              System.out.println("Enter value of n");
                                              n = Integer.parseInt(stdin.readLine());
                                            System.out.println();
                                            double j1=0,p1=1;
                                              double m=0.0;
                                              i1=0.0;
                                              s1=0.0;
                                              for(i1=1;i1<=n;i1++)
                                              {
                                                  for(j1=1;j1<=i1;j1++)
                                                  {
                                                      s1=s1+j1;
                                                      p1=p1*j1;
                                                    }
                                                    m=m+(s1/p1);
                                                    s1=0;
                                                    p1=1;
                                                }
                                                System.out.print(m);
                                              
                                                break;
                                       case 6:
                                              System.out.println("Enter value of n");
                                              n = Integer.parseInt(stdin.readLine());
                                              System.out.println("Enter value of a");
                                              int a = Integer.parseInt(stdin.readLine());
                                            System.out.println();
                                            p1=1.0;
                                              s1=0.0;
                                              i1=0.0;
                                              for(i1=1;i1<=n;i1++)
                                              {
                                                  p1=p1*i1;
                                                  s1=s1+(a/p1);
                                                }
                                                System.out.print(s1);
                                                         
                                                break;
                                        case 7:
                                              System.out.println("Enter value of n");
                                              n = Integer.parseInt(stdin.readLine());
                                            
                                            System.out.println("Enter value of a");
                                              a = Integer.parseInt(stdin.readLine());
                                            System.out.println();
                                             j1=3.0;
                                              s1=0.0;
                                              for(i1=1;i1<=n;i1++)
                                              {
                                                  s1=s1+((a+i1)/j1);
                                                  j1=j1+2;
                                                }
                                                System.out.print(s1);
                                                 
                                                break;
                                       case 8:
                                              System.out.println("Enter value of n");
                                              n = Integer.parseInt(stdin.readLine());
                                              System.out.println("Enter value of a");
                                              a = Integer.parseInt(stdin.readLine());
                                            System.out.println();
                                            s=0;
                                              for(i=1;i<=n;i++)
                                              {
                                                  s=s+(a+i);
                                                }
                                                System.out.print(s);
                                                
                                                break;
                                       case 9:
                                              System.out.println("Enter value of n");
                                              n = Integer.parseInt(stdin.readLine());
                                              System.out.println("Enter value of a");
                                              a = Integer.parseInt(stdin.readLine());
                                            System.out.println();
                                            s1=0.0;
                                            i1=0.0;
                                              for(i1=2;i1<=20;i1=i1+3)
                                              {
                                                  s1=s1+(a/i1);
                                                }
                                                System.out.print(s1);
                                              
                                                break;
                                                
                                                
                                                
                                        case 10:
                                              System.out.println("Enter valueof n");
                                              n = Integer.parseInt(stdin.readLine());
                                              System.out.println("Enter value of a");
                                              a = Integer.parseInt(stdin.readLine());
                                            System.out.println();
                                            j1=1.0;
                                              s1=0.0;
                                              i1=0.0;
                                              for(i1=1;i1<=n;i1=i1+2)
                                              {
                                                  s1=s1+((Math.pow(a,i1))/j1);
                                                  j1=j1+4;
                                                }
                                                System.out.print(s1);
                                                
                                                break;
                                                    
                                            }
                                            break;
                        case 3:
                              
                        System.out.println("_S U B  M E N U_");
                        System.out.println();
                        System.out.println("1. P A T T E R N 1");
                        System.out.println();
                        System.out.println("2. P A T T E R N 2");
                        System.out.println();
                        System.out.println("3. P A T T E R N 3");
                        System.out.println();
                        System.out.println("4. P A T T E R N 4");
                        System.out.println();
                        System.out.println("5. P A T T E R N 5");
                        System.out.println();
                        System.out.println("6. P A T T E R N 6");
                        System.out.println();
                        System.out.println("7. P A T T E R N 7  ");
                        System.out.println();
                        System.out.println("8. P A T T E R N 8 ");
                        System.out.println();
                        System.out.println("9. P A T T E R N 9");
                        System.out.println();
                        System.out.println("10. P A T T E R N 10");
                        System.out.println();
                        System.out.println("Enter your choice");
                        int ch3=Integer.parseInt(stdin.readLine());
                        System.out.println();
                        
                        switch(ch3)
                                 {
                                     case 1:
                                            int i=0,j=0,sp=0;
                                            
                                             for(i=5;i>=1;i--)
                                            {
                                                for(j=1;j<=sp;j++)
                                               System.out.print(" ");
                                               sp++;
                                               for(j=i;j>=1;j--)
                                               System.out.print(j);
                                               System.out.println();
                                            }
                                        
                                            break;
                                        
                                           
                                            
                                     case 2 : 
                                            

                                            i=0;
                                            j=0;
                                            for(i=1;i<=5;i++)
                                            {
                                                for( j=1;j<=i;j++)
                                                {
                                                    if(j%2==0)
                                                    System.out.print("0");
                                                    else
                                                    System.out.print("1");
                                                }
                                                System.out.println();
                                            }
                                            
                                            break;
                                              
                                           
                                                
                                              
                                            
                                            
                                     case 3 :
                                             
                                             i=0;
                                             j=0;
                                             for(i=1;i<=5;i++)
                                             {
                                                 for(j=i;j>=1;j--)
                                                 {
                                                     if(j%2==0)
                                                     System.out.print("0");
                                                     else
                                                     System.out.print("1");
                                                }
                                                System.out.println();
                                            }
                                            
                                             
                                             
                                            break;
                                             
                                          
                                      case 4:

                                              i=0;
                                              j=0;
                                              int k=0;
                                              for(i=5;i>=1;i--)
                                              {
                                                  for(j=1;j<=i;j++)
                                                  System.out.print(++k);
                                                  System.out.println();
                                                }
                                                
                                                
                                                break;
                                                
                                                
                                                
                                     case 5:
                                              char ab='A';
                                              i=0;
                                              j=0;
                                              k=0;
                                              
                                              for(i=1;i<=5;i++)
                                              {
                                                  for(j=1;j<=i;j++)
                                                  
                                                      System.out.print(i);
                                                  for(k=i;k<=5;k++)
                                                  System.out.print(ab);
                                                  ab++;
                                                  System.out.println();
                                                }
                                                
                                                break;
                                       
                                     case 6:
                                              i=0;
                                              j=0;
                                              for(i=1;i<=5;i++)
                                              {
                                                  for(j=1;j<=5;j++)
                                                  {
                                                      if((i==j)||((i+j)==(5+1)))
                                                      System.out.print("X");
                                                      else
                                                      System.out.print(" ");
                                                    }
                                                
                                                System.out.println();
                                            }       
                                                
                                            break;
                                        
                                     case 7:
                                              char i1;
                                              char k1;
                                              j=0;
                                              sp=-1;
                                              for(i1='E';i1>='A';i1--)
                                              {
                                                  for(k1='A';k1<=i1;k1++)
                                                  System.out.print(k1);
                                                  for(j=1;j<=sp;j++)
                                                  System.out.print(" ");
                                                  sp+=2;
                                                  for(k1=i1;k1>='A';k1--)
                                                  {
                                                      if(k1!='E')
                                                      System.out.print(k1);
                                                    }
                                                    System.out.println();
                                                    }
                                                   
                                              
                                                 
                                                break;
                                       case 8:
                                              int isp=-1,osp=4;
                                              i=0;
                                              j=0;
                                              k=0;
                                              for(i=1;i<=5;i++)
                                              {
                                                  for(j=1;j<=osp;j++)
                                                  System.out.print(" ");
                                                  osp--;
                                                  System.out.print("1");
                                                  for(j=1;j<=isp;j++)
                                                  System.out.print(" ");
                                                   
                                                isp+=2;
                                                  if(i!=1)
                                                  System.out.print("1");
                                                  System.out.println();
                                                }
                                                isp=5;
                                                osp=1;
                                                i=0;
                                                j=0;
                                                
                                                for(i=4;i>=1;i--)
                                                {
                                                    for(j=1;j<=osp;j++)
                                                    System.out.print(" ");
                                                    osp++;
                                                    System.out.print("1");
                                                    for(j=1;j<=isp;j++)
                                                    System.out.print(" ");
                                                    isp-=2;
                                                    if(i!=1)
                                                    System.out.print("1");
                                                    System.out.println();
                                                }
                                                
                                                break;
                                               
                                       case 9:
                                              sp=3;
                                              i=0;
                                              j=0;
                                              
                                              
                                              for(i=1;i<=4;i++)
                                              {
                                                  for(j=1;j<=sp;j++)
                                                  System.out.print(" ");
                                                  sp--;
                                                  for(j=1;j<=i;j++)
                                                  System.out.print(j);
                                                  for(j=i-1;j>=1;j--)
                                                  System.out.print(j);
                                                  System.out.println();
                                                }
                                              sp=1;
                                             i=0;
                                             j=0;
                                              for(i=3;i>=1;i--)
                                              {
                                                  for(j=1;j<=sp;j++)
                                                  System.out.print(" ");
                                                  sp++;
                                                  for(j=1;j<=i;j++)
                                                  System.out.print(j);
                                                  for(j=i-1;j>=1;j--)
                                                  System.out.print(j);
                                                  System.out.println();
                                                }
                                                
                                                break;
                                                
                                        case 10:
                                              sp=4;
                                              i=0;
                                              j=0;
                                             
                                              for(i=1;i<=5;i++)
                                              {
                                                  for(j=1;j<=sp;j++)
                                                  System.out.print(" ");
                                                  sp--;
                                                  for(j=1;j<=i;j++)
                                           
                                                  System.out.print("a"+" ");
                                                  System.out.println();
                                                }
                                              sp=1;
                                              i=0;
                                              j=0;
                                            
                                              for(i=4;i>=1;i--)
                                              {
                                                  for(j=1;j<=sp;j++)
                                                  System.out.print(" ");
                                                  sp++;
                                                  for(j=1;j<=i;j++)
                                                  
                                                  System.out.print("a"+" ");
                                                  System.out.println();
                                                }
                                                
                                                break;
                                            }
                                            break;
                                            
                        case 4:
                              
                        System.out.println("_S U B  M E N U_");
                        System.out.println();
                        System.out.println("1. PRINT THE INITIALS OF A STRING IN THE FOLLOWING MANNER :");
                        System.out.println("   INPUT : Pearls Of God");
                        System.out.println("   OUTPUT : P.O.G");
                        System.out.println();
                        System.out.println("2. DISPLAY PALINDROME WORDS ALONG WITH ITS FREQUENCY ");
                        System.out.println("   FROM THE INPUTED STRING");
                        System.out.println();
                        System.out.println("3. INPUT A STRING AND REPLACE ALL THE VOWELS WITH'*' PRESENT IN IT.");
                        System.out.println();
                        System.out.println("4. INPUT A THREE LETTER WORD AND PRINT ");
                        System.out.println("   ALL POSSIBLE THREE LETTER COMBINATIONS ");
                        System.out.println();
                        System.out.println("5. PIGLATIN FORM OF A STRING");
                        System.out.println();
                        System.out.println("6. INPUT A STRING AND DISPLAY IT IN THE FOLLOWING MANNER :");
                        System.out.println("   INPUT : Mohandas Karamchand Gandhi");
                        System.out.println("   OUTPUT : Gandhi Mohandas Karamchand");
                        System.out.println();
                        System.out.println("7. DISPLAY  THE LONGEST AND THE SMALLEST WORD ");
                        System.out.println("   FROM AN INPUTED STRING ");
                        System.out.println();
                        System.out.println("8. INPUT A STRING AND DISPLAY THE WORD WHICH CONTAINS  ");
                        System.out.println("   THE MAXIMUM NUMBER OF VOWELS");
                        System.out.println();
                        System.out.println("9. UNIQUE STRING");
                        System.out.println();
                        System.out.println("10. INPUT STRING AND CONVERT ALL LETTERS OF THE WORDS  ");
                        System.out.println("    OTHER THAN THE FIRST LETTER TO LOWER CASE");
                        System.out.println();
                        System.out.println("Enter your choice");
                        int ch4=Integer.parseInt(stdin.readLine());
                        System.out.println();
                        switch(ch4)
                                 {
                                     case 1:
                                            System.out.println("Enter String");
                                            String s = stdin.readLine();
                                            s=s.trim();
                                            s=" "+s;
                                            int l=s.length();
                                            int i=0;
                                            int c=0;
                                            char ab;
                                             for(i=0;i<l;i++)
                                            {
                                                ab=s.charAt(i);
                                                
                                                if(ab==32)
                                                c++;
                                               
                                            }
                                            for(i=0;i<l;i++)
                                            {
                                                ab=s.charAt(i);
                                                if(ab==32)
                                                {
                                                    --c;
                                            
                                                    if(c!=0)
                                                    System.out.print((s.charAt(i+1))+".");
                                                    else
                                                    System.out.print((s.charAt(i+1)));
                                                }
                                            }
                                            
                                            break;
                                            
                                     case 2 : 
                                            System.out.println("Enter String");
                                             s = stdin.readLine();
                                            s=s.trim();
                                            s=s+" ";
                                            l=s.length();
                                            String s1="";
                                            String s2="";
                                            i=0;
                                            c=0;
                                            ab=' ';
                                              
                                             System.out.print("PALINDROME WORDS :"); 
                                             for(i=0;i<l;i++)
                                             {
                                               ab=s.charAt(i);
                                               
                                               if(ab!=32)
                                               {
                                                   s1=s1+ab;
                                                   s2=ab+s2;
                                               
                                            }
                                            else
                                            {
                                                if(s1.equals(s2))
                                                {
                                                    c++;
                                                    
                                                    System.out.print(s2); 
                                                    System.out.print(",");
                                                }
                                                s1="";
                                                s2="";
                                            }
                                        }
                                        System.out.println();
                                        System.out.println("FREQUENCY :"+c);
                                        
                                        break;
                                     
                                     case 3:
                                            System.out.println("Enter String");
                                             s = stdin.readLine();
                                             
                                            l=s.length();
                                            s1="";
                                            c=0;
                                            i=0;
                                           
                                            ab=' ';
                                              
                                             
                                             for(i=0;i<l;i++)
                                             {
                                               
                                               ab=s.charAt(i);
                                               if(ab=='A'||ab=='a'||ab=='E'||ab=='e'||ab=='I'||ab=='i'||ab=='O'||ab=='o'||ab=='U'||ab=='u')                                                                                                                                                
                                               s1=s1+"*";
                                               else
                                               s1=s1+ab; 
                                             } 
                                            System.out.print(s1); 
                                          
                                              
                                            break;
                                            
                        case 4 :
                                             System.out.println("Enter a three letter String");
                                             s = stdin.readLine();
                                            s=s.trim();
                                            
                                            l=s.length();
                                                                               
                                            i=0;
                                            int j=0;
                                            int k=0;
                                            char a,b,c1;
                                            if(l==3)
                                            {
                                              
                                             
                                             for(i=0;i<l;i++)
                                             {
                                                 
                                             for(j=0;j<l;j++)
                                             {
                                                 
                                             for(k=0;k<l;k++)
                                             {
                                               a=s.charAt(i);
                                               b=s.charAt(j);
                                               c1=s.charAt(k);
                                             if(i!=j && j!=k && k!=i)
                                        System.out.println(a+""+b+""+c1);
                                    }
                                }
                            }
                        }
                                        
                        break;
                                     
                                             
                                          
                        case 5:
                                    System.out.println("Enter String");
                                    s = stdin.readLine();
                                    s=s.toUpperCase();
                                    
                                    l=s.length();
                                    i=0;
                                    int pos=0;
                                     ab=' ';
                                              
                                             
                                             for(i=0;i<l;i++)
                                             {
                                               ab=s.charAt(i);
                                               
                                               if(ab=='A'||ab=='a'||ab=='E'||ab=='e'||ab=='I'||ab=='i'||ab=='O'||ab=='o'||ab=='U'||ab=='u')
                                               {
                                                  pos=i;
                                                  break;
                                                }
                                            }
                                            for(i=pos;i<l;i++)
                                             {
                                               ab=s.charAt(i);
                                               System.out.print(ab);
                                            }
                                             for(i=0;i<pos;i++)
                                             {
                                               ab=s.charAt(i);
                                               System.out.print(ab);
                                            }
                                            System.out.print("AY");
                                               
                                        break;
                        
    
                                            
                      case 6:
                             System.out.println("Enter String");
                             s = stdin.readLine();
                            s=s.trim();
                            s=" "+s;
                            l=s.length();
                            s1="";
                            
                            i=0;
                            int p=0;
                            ab=' ';
                              
                             
                             for(i=(l-1);i>=0;i--)
                             {
                               ab=s.charAt(i);
                               
                               if(ab==32)
                               {
                                   p=i;
                                   break;
                               
                            }
                            else
                                s1=ab+s1;
                                
                            }
                        for(i=0;i<p;i++)
                        {
                            ab=s.charAt(i);
                            s1=s1+ab;
                        }
                        System.out.print(s1);
                        
                        
                        break;
                       
                        case 7:
                              
                              System.out.println("Enter String");
                             s = stdin.readLine();
                            s=s.trim();
                            s=s+" ";
                            l=s.length();
                            s1="";
                            s2="";
                            String s3="";
                            i=0;
                            int max=0,min=l,l1=0;
                            ab=' ';
                              
                             
                             for(i=0;i<l;i++)
                             {
                               ab=s.charAt(i);
                               
                               if(ab!=32)
                              
                                   s1=s1+ab;
                                   
                           
                            else
                            {
                                l1=s1.length();
                               if(l1>max)
                               {
                                   max=l1;
                                
                                s2="";
                                s2=s1;
                            }
                              else if(l1<min)
                              {
                                  min=l1;
                                  s3="";
                                  s3=s1;
                                }
                                s1="";
                            }
                        }
                        System.out.println(s2+" "+max);
                        System.out.println(s3+" "+min);
                        
                        break;  
                        
                        case 8:
                              System.out.println("Enter String");
                              s = stdin.readLine();
                            s=s.trim();
                            s=s+" ";
                            l=s.length();
                            s1="";
                            s2="";
                            i=0;
                            c=0;
                            
                            max=0;
                            j=0;
                            ab=' ';  
                             
                             for(i=0;i<l;i++)
                             {
                               ab=s.charAt(i);
                               
                               if(ab!=32)
                               {
                                   s1=s1+ab;
                                   
                                   if(ab=='A'||ab=='a'||ab=='E'||ab=='e'||ab=='I'||ab=='i'||ab=='O'||ab=='o'||ab=='U'||ab=='u')
                                   c++;
                                }
                                else
                                {
                                    if(c>max)
                                    {
                                        max=c;
                                        
                                        s2=s1;
                                    }
                                    s1="";
                                    c=0;
                                }
                            }
                                System.out.print(s2+" "+max);
                         
                        break;
                       
                       case 9:
                             System.out.println("Enter String");
                             s = stdin.readLine();
                           
                            l=s.length();
                            l1=0;
                            char j1;
                            
                            c=0;
                            c1=0;
                            k=0;
                            int flag=1;
                            ab=' ';
                              
                             
                             for(i='A',j='a';i<='Z'&&j<='z';i++,j++)
                             {
                                 c=0;
                                 c1=0;
                                 for(k=0;k<l;k++)
                                 {
                                   ab=s.charAt(k);
                               
                                 if(ab==i)
                                 c1++;
                                }
                                if(c>1||c1>1)
                               {
                                   flag=0;
                                   break;
                            }
                        }
                            if(flag==1)
                            System.out.println("It is a UNIQUE STRING");    
                            else
                             System.out.println("It is not a UNIQUE STRING");    
                               
                        break;
                       
                        case 10:
                             System.out.println("Enter String");
                             s = stdin.readLine();
                            s=s.toLowerCase();
                            s=s.trim();
                            s=" "+s;
                            l=s.length();
                            
                            i=0;
                            
                            ab=' ';
                              
                             
                             for(i=0;i<l;i++)
                             {
                               ab=s.charAt(i);
                               
                               if(ab==32)
                               {
                                 System.out.print(ab);
                                 System.out.print((char)((s.charAt(++i))-32));
                                }
                               else
                               System.out.print(ab);
                            }
                           
                        
                            break;
                             
                       
                                              
                   }
                        
                   break;
                                            
                                            
                 case 5:
                              
                        System.out.println("_S U B  M E N U_");
                        System.out.println();
                        System.out.println("1. STORE 20 NUMBERS IN AN ARRAY AND");
                        System.out.println("   DISPLAY ONLY THOSE NUMBERS HAVING A COMPLETE SQUARE ROOT .");
                        System.out.println();
                        System.out.println("2. INPUT 20 NUMBERS IN A SINGLE DIMENSIONAL ARRAY,arr. ");
                        System.out.println("   TRANSFER AND STORE ALL THE EVEN NUMBERS IN AN ARRAY,even[] ");
                        System.out.println("   AND ALL THE ODD NUMBERS IN ANOTHER ARRAY,odd[]. ");
                        System.out.println("   FINALLY PRINT THE ELEMENTS OF BOTH THE ARRAY. ");
                        System.out.println();
                        System.out.println("3. STORE 6 ELEMENTS IN AN ARRAY, 'P' AND 4 ELEMENTS IN AN ");
                        System.out.println("   ARRAY,'Q'. NOW PRODUCE A THIRD ARRAY,'R' "  );
                        System.out.println("   CONTAINING ALL THE ELEMENTS OF P AND Q.");
                        System.out.println();
                        System.out.println("4. STORE RUNS SCORED BY 11 PLAYERS IN AN INNINGS ALONG WITH THEIR"  );
                        System.out.println("   NAMES. NOW DISPLAY THE NAME OF THE CRICKETER WHO HAS MADE THE HIGHEST SCORE IN THE ");
                        System.out.println("   INNINGS ALONG WITH THE RUNS SCORED.");
                        System.out.println();
                        System.out.println("5. STORE ROLL NO. AND MARKS OF 3 SUBJECTS OF 50 STUDENTS.");
                        System.out.println("   CALCULATE AND DISPLAY-");
                        System.out.println("i. AVERAGE MARKS OBTAINED BY EACH STUDENT.");
                        System.out.println("ii.PRINT THE ROLL NO. AND AVERAGE MARKS OF THE STUDENT WHOSE AVERAGE IS- ");
                        System.out.println("a. ABOVE 80 ");
                        System.out.println("b. BELOW 80");
                        System.out.println();
                        System.out.println("6. WRITE A PROGRAM THAT REVERSES AN ARRAY AND STORES IT IN ");
                        System.out.println("   THE SAME ARRAY. ");
                        System.out.println();
                        System.out.println("7. WRITE A PROGRAM TO DELETE ELEMENTS FROM A SINGLE DIMENSIONAL " );
                        System.out.println("   ARRAY OF SIZE 5. ");
                        System.out.println();
                           System.out.println("8. WRITE A PROGRAM TO ACCEPT 15 INTEGERS FROM THE KEYBOARD,  ");
                        System.out.println("   ASSUMING THAT NO INTEGER ENTERED IS ZERO. PERFORM ");
                        System.out.println("   SELECTION SORT ON THE INTEGERS AND THEN PRINT THEM IN ASCENDING ORDER");
                        System.out.println();
                        System.out.println("9. WRITE A PROGRAM TO ACCEPT THE NAMES OF 10 CITIES IN A SINGLE DIMENSIONAL ARRAY");
                        System.out.println("   ANT THEIR STD CODES IN ANOTHER SINGLE DIMENSIONAL ARRAY. SEARCH FOR THE NAME OF THE CITY");
                        System.out.println("   INPUT BY THE USER IN THE LIST AND DISPLAY A PROPER SEARCH MESSAGE. ");
                        System.out.println();
                        System.out.println("10. WRITE A PROGRAM TO PERFORM BINARY SEARCH ON A LIST OF INTEGERS, ");
                        System.out.println("    TO SEARCH FOR AN ELEMENT INPUT BY THE USER,IF FOUND DISPLAY THE ELEMENT ALONG WITH IT'S ");
                        System.out.println("    POSITION,OTHERWISE DISPLAY PROPER MESSAGE.");
                        System.out.println("Enter your choice");
                        int ch5=Integer.parseInt(stdin.readLine());
                        System.out.println();
                        switch(ch5)
                                 {
                                     case 1:
                                            int X[]=new int[20];
                                            int i=0;
                                            for(i=0;i<20;i++)
                                            {
                                              System.out.println("Enter number");
                                              X[i]=Integer.parseInt(stdin.readLine());
                                            }
                                            System.out.println();
                                            int sq=0;
                                            for(i=0;i<20;i++)
                                            {
                                                sq=(int)Math.sqrt(X[i]);
                                                if((sq*sq)==X[i])
                                                System.out.println(X[i]+" "+"HAS A COMPLETE SQUARE ROOT");
                                            }
                                       
                                            break;
                                            
                                     case 2:
                                            int arr[]=new int[20];
                                            int even[]=new int[20];
                                            int odd[]=new int[20];
                                            i=0;
                                            for(i=0;i<20;i++)
                                            {
                                              System.out.println("Enter numbers");
                                              arr[i]=Integer.parseInt(stdin.readLine());
                                            }
                                            System.out.println();
                                            int p1=-1,p2=-1;
                                            for(i=0;i<20;i++)
                                            {
                                                if(arr[i]%2==0)
                                                even[++p1]=arr[i];
                                            }
                                             for(i=0;i<20;i++)
                                            {
                                                if(arr[i]%2!=0)
                                                odd[++p2]=arr[i];
                                            }
                                            for(i=0;i<p1;i++)
                                            System.out.println(even[i]);
                                            System.out.println();
                                            for(i=0;i<p2;i++)
                                            System.out.println(odd[i]);
                                            
                                       
                                            break;
                                     
                                     case 3:
                                            int P[]=new int[6];
                                            int Q[]=new int[4];
                                            int R[]=new int[10];
                                            i=0;
                                            for(i=0;i<6;i++)
                                            {
                                              System.out.println("Enter numbers");
                                              P[i]=Integer.parseInt(stdin.readLine());
                                            }
                                            System.out.println();
                                            for(i=0;i<4;i++)
                                            {
                                              System.out.println("Enter numbers");
                                              Q[i]=Integer.parseInt(stdin.readLine());
                                            }
                                            System.out.println();
                                            p1=-1;
                                            for(i=0;i<6;i++)
                                            R[++p1]=P[i];
                                                                    
                                            for(i=0;i<4;i++)
                                            R[++p1]=Q[i];
                                                                            
                                            for(i=0;i<10;i++)
                                            System.out.println(R[i]);
                                            
                                            break;
                                     case 4:
                                           
                                           int X1[]=new int[11];
                                            String Y[]=new String[11];
                                            i=0;
                                            for(i=0;i<11;i++)
                                            {
                                              System.out.println("Enter name");
                                              Y[i]=stdin.readLine();
                                             
                                              System.out.println("Enter runs scored");
                                              X1[i]=Integer.parseInt(stdin.readLine());
                                            }
                                            System.out.println();
                                            p1=0;
                                            p2=0;
                                            int max=X1[0],min=X1[0];
                                            
                                            for(i=0;i<11;i++)
                                            {
                                                if(X1[i]>max)
                                                {
                                                    max=X1[i];
                                                    p1=i;
                                                }
                                                if(X1[i]<min)
                                                {
                                                    min=X1[i];
                                                    p2=i;
                                                }
                                            }
                                             System.out.println(Y[p1]+" "+X1[p1]);
                                             System.out.println(Y[p2]+" "+X1[p2]);
                                             
                                            break;
                                     case 5:
                                            int R1[]=new int[50];
                                            int m1[]=new int[50];
                                            int m2[]=new int[50];
                                            int m3[]=new int[50];
                                            double avg[]=new double[50];
                                            i=0;
                                            for(i=0;i<50;i++)
                                            {
                                              System.out.println("Enter roll no.");
                                              R1[i]=Integer.parseInt(stdin.readLine());
                                              System.out.println("Enter marks of 3 subjects"); 
                                               m1[i]=Integer.parseInt(stdin.readLine());
                                               m2[i]=Integer.parseInt(stdin.readLine());
                                               m3[i]=Integer.parseInt(stdin.readLine());
                                            }
                                            System.out.println();
                                            for(i=0;i<50;i++)
                                            {
                                                avg[i]=(m1[i]+m2[i]+m3[i])/3;
                                                System.out.println(avg[i]);
                                            }
                                            System.out.println();
                                             System.out.println("Averag more then 80");
                                             for(i=0;i<50;i++)
                                            {
                                                if(avg[i]>80)
                                                System.out.println(R1[i]+" " +avg[i]);
                                            }
                                            System.out.println();
                                            System.out.println("Averag less then 80");
                                            for(i=0;i<50;i++)
                                            {
                                                if(avg[i]<80)
                                                System.out.println(R1[i]+" "+avg[i]);
                                            }
                                            
                                               
                                       break;
                                     
                                     case 6:
                                            System.out.println("Enter size ");
                                            int s=Integer.parseInt(stdin.readLine());
                                            System.out.println();
                                            int X2[]=new int[s];
                                            i=0;
                                            int j=0;
                                            for(i=0;i<s;i++)
                                            {
                                              System.out.println("Enter elements");
                                              X2[i]=Integer.parseInt(stdin.readLine());
                                            }
                                            System.out.println();
                                            int temp=0;
                                            for(i=0,j=s-1;i<(s/2);i++,j--)
                                            {
                                                temp=X2[i];
                                                X2[i]=X2[j];
                                                X2[j]=temp;
                                            }
                                            for(i=0;i<s;i++)
                                            System.out.println(X2[i]);
                                                                   
                                            break;
                                     case 7:
                                           
                                            int s1=5;
                                            
                                            int X3[]=new int[s1];
                                            i=0;
                                            j=0;
                                            int k=0;
                                            for(i=0;i<s1;i++)
                                            {
                                              System.out.println("Enter elements");
                                              X3[i]=Integer.parseInt(stdin.readLine());
                                            }
                                            System.out.println();
                                            for(i=0;i<s1;i++)
                                            {
                                                for(j=i+1;j<s1;j++)
                                                {
                                                    if(X3[i]==X3[j])
                                                    {
                                                        --s1;
                                                for(k=j;k<s1;k++)
                                                X3[k]=X3[k+1];
                                                --j;
                                            }
                                        }
                                    }
                                    for(i=0;i<s1;i++)
                                    System.out.println(X3[i]);
                                    
                                    break;
                                            
                                                  
                                    case 8:
                                           int X4[]=new int[15];
                                           j=0;
                                           i=0;
                                           int pos=0;
                                           int small=0;
                                           
                                            for(i=0;i<15;i++)
                                            {
                                              System.out.println("Enter integers");
                                              X4[i]=Integer.parseInt(stdin.readLine());
                                            
                                              if(X4[i]==0)
                                              --i;
                                            }
                                           System.out.println();
                                           for(i=0;i<15;i++)
                                            {
                                                small=X4[i];
                                                pos=i;
                                                for(j=i+1;j<15;j++)
                                                {
                                                    if(X4[j]<small)
                                                    {
                                                        small=X4[j];
                                                        pos=j;
                                                    }
                                                }
                                                temp=X4[i];
                                                X4[i]=X4[pos];
                                                X4[pos]=temp;
                                            }
                                            for(i=0;i<15;i++)
                                            System.out.println(X4[i]);
                                                   
                                            break;
                                     
                                    case 9:
                                            String city[]=new String[10];
                                            int STD[]=new int[10];
                                            
                                            for(i=0;i<10;i++)
                                            {
                                              System.out.println("Enter name of city");
                                              city[i]=stdin.readLine();
                                              System.out.println("Enter STD code of city");
                                              STD[i]=Integer.parseInt(stdin.readLine());
                                            }
                                            System.out.println();
                                            System.out.println("Enter name of city to be searched");
                                            String search=stdin.readLine();
                                            System.out.println();
                                            int flag=0;
                                            i=0;
                                            for(i=0;i<10;i++)
                                            {
                                                if(search.equals(city[i]))
                                            {
                                               flag=1;
                                               break;
                                            }
                                        }
                                        if(flag==1)
                                        System.out.println("Search Successful");
                                        else
                                        System.out.println("Search Unsuccessful. No such city in the list");
                                        
                                                           
                                        break;
                                     case 10:
                                            System.out.println("Enter size ");
                                            int s2=Integer.parseInt(stdin.readLine());
                                            System.out.println();
                                            int A[]=new int[s2];
                                            i=0;
                                            j=0;
                                            temp=0;
                                            for(i=0;i<s2;i++)
                                            {
                                              System.out.println("Enter elements");
                                              A[i]=Integer.parseInt(stdin.readLine());
                                            }
                                            System.out.println();
                                            for(i=0;i<s2;i++)
                                            {
                                                for(j=0;j<(s2-i-1);j++)
                                                {
                                                  if(A[j]>A[j+1])
                                                  {
                                                      temp=A[j];
                                                      A[j]=A[j+1];
                                                      A[j+1]=temp;
                                                    }
                                                }
                                            }
                                            System.out.println("Enter element to be searched");
                                            int search1=Integer.parseInt(stdin.readLine());
                                            System.out.println();
                                            flag=0;
                                            int l=0,u=s2-1,m=0;
                                            while(l<=u)
                                            {
                                                m=(l+u)/2;
                                                if(search1>A[m])
                                                l=m+1;
                                                else if(search1<A[m])
                                                u=m-1;
                                                else
                                                {
                                                    flag=1;
                                                    break;
                                                }
                                            }
                                            if(flag==1)
                                            System.out.println("Element found at position"+" "+(m+1));
                                            else
                                            System.out.println("Element not found");
                                            
                                            break;
                                        }
                                            
                                break;
                                     
                                            
                        
                            }
                        }
                    }

