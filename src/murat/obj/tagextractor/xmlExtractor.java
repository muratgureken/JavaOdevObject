package murat.obj.tagextractor;

public class xmlExtractor {
	    /**
	     * @param args the command line arguments
	     */
	    public static void main(String[] args) {

	        String s= "<SA premium>Imtiaz has a secret crash</SA premium>";
	        String s1,s2,s3;
	        boolean stringVar = false;
	        int index=0, index2;
	        int count=0;
	        while(index<=s.length())
	        {
	            count++;
	            /*System.out.println("count:"+count);*/
	            index2 = s.indexOf(">",index);
	            index = s.indexOf("<",index);
	            if(index>index2)
	            {
	                index2 = s.indexOf(">",index);
	            }
	            if(IOB(index, s.length())||(IOB(index2, s.length())))
	            {
	                break;
	            }
	            index++;
	            if(s.substring(index, index2).contains("<")||s.substring(index, index2).contains("/"))
	            {
	                continue;
	            }

	            s1 = s.substring(index, index2);
	            if(s1.length()==0)
	            {
	                continue;
	            }
	            index = index2+1;
	            index2 = s.indexOf("<",index2);
	            if(IOB(index, s.length())||(IOB(index2, s.length())))
	            {
	                break;
	            }
	            if(s.substring(index, index2).contains(">")||s.substring(index, index2).contains("/"))
	            {
	                index = index2;
	                continue;
	            }
	            s2 = s.substring(index,index2);
	            if(s2.length()==0)
	            {
	                index = index2;
	                continue;
	            }            
	            index = index2+1;
	            if(IOB(index, s.length()))
	            {
	                break;
	            }
	            if(!(s.substring(index, index+1).contains("/")))
	            {
	                index--;
	                continue;
	            }
	            index++;
	            index2 = s.indexOf(">",index);
	            if(IOB(index, s.length())||(IOB(index2, s.length())))
	            {
	                break;
	            }
	            if(s.substring(index, index2).contains("<")||s.substring(index, index2).contains("/"))
	            {
	                continue;
	            }
	            s3 = s.substring(index,index2);
	            if(s3.length()==0)
	            {
	                index = index2+1;
	                continue;
	            }
	            if(s1.equals(s3))
	            {
	                stringVar = true;
	                System.out.println(s2);
	                index = index2+1;
	            }
	            else
	            {
	                index = index2+1;
	            }
	        }
	        if(!stringVar)
	        {
	            System.out.println("None");
	        }
	    }
	   
	    public static boolean IOB(int index,int limit)
	    {
	        if((index>limit)||(index==-1))
	        {
	            return true;
	        }
	        else
	        {
	            return false;
	        }
	    }
	}


