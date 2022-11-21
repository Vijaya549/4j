
/*
Online Java - IDE, Code Editor, Compiler

Online Java is a quick and easy tool that helps you to build, compile, test your programs online.
*/

class HelloWorld {
    public static void main(String[] args) {
        // System.out.println("Hello, World!");
        int a[][]=new int[4][2];
        
        int b[][]={{1,0,0,1,1},{1,0,0,0,1},{1,0,0,1,1},{1,1,1,1,1}};
        //initialising variables to store corners of minimum size of sub-rectangles
        int rlow=b[0].length;
        int rhigh=0;
        int clow=b.length;
        int chigh=0;
        //loop to traverse matrix columns
        for(int i=0;i<4;i++)
        {
            //loop to traverse matrix rows
            for(int j=0;j<5;j++)
            {
                if(b[i][j]==0)
                {
                    if(j<rlow) //condition to find left most row index
                    {
                        rlow=j;
                    }
                    if(i<clow)//condition to find left most column index
                    {
                        clow=i;
                    }
                    if(j>rhigh)//condition to find right most row index
                    {
                        rhigh=j;
                    }
                    if(i>chigh)//condition to find right most column index
                    {
                        chigh=i;
                    }
                }
            }
        }
        a[0][0]=clow;
        a[0][1]=rlow;
        a[1][0]=clow;
        a[1][1]=rhigh;
        a[2][0]=chigh;
        a[2][1]=rlow;
        a[3][0]=chigh;
        a[3][1]=rhigh;
        
        
        //to print all four corners
    for(int i=0;i<4;i++)
        {
            for(int j=0;j<2;j++)
            {    if(j!=1)
                System.out.print("("+a[i][j]+",");
                else
                System.out.print(a[i][j]);
            }
            System.out.print(")");
            System.out.println();
        }
    }
}