class Solution {
    public boolean isMonotonic(int[] A) {
       int  b[]=new int[A.length];
        int  c[]=new int[A.length];
        for(int i =0; i<A.length; i++)
        {
            b[i]=A[i];
        }
        Arrays.sort(b);
        int temp=0;
        for(int i=A.length-1; i>=0; i--){
            c[temp]=b[i];
            temp++;
        }
        temp=0;
        int gemp=0;
        for(int i=0; i<A.length; i++)
        {
            if(A[i]==b[i])
                temp++;
        }
        for(int i=0; i<A.length; i++)
        {
            if(A[i]==c[i])
                gemp++;
        }
        if(temp==A.length || gemp==A.length)
        {
            return true;
        }
        else
            return false;
    }
}