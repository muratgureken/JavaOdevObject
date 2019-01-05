package murat.obj.tagextractor;

public class xmlExtractor {
	    /**
	     * @param args the command line arguments
	     */
	    public static void main(String[] args) {

	        String line= "<SA premium>Imtiaz has a secret crash</SA premium>";
	        //line = "";
	        String s1,s2,s3;
	        boolean stringVar = false;
	        int index=0, index2;
	        int count=0;
	        while(index<=line.length())
	        {
	            count++;
	            /*System.out.println("count:"+count);*/
	            index2 = line.indexOf(">",index);
	            index = line.indexOf("<",index);
	            if(index>index2)
	            {
	                index2 = line.indexOf(">",index);
	            }
	            if(IOB(index, line.length())||(IOB(index2, line.length())))
	            {
	                break;
	            }
	            index++;
	            if(line.substring(index, index2).contains("<")||line.substring(index, index2).contains("/"))
	            {
	                continue;
	            }

	            s1 = line.substring(index, index2);
	            if(s1.length()==0)
	            {
	                continue;
	            }
	            index = index2+1;
	            index2 = line.indexOf("<",index2);
	            if(IOB(index, line.length())||(IOB(index2, line.length())))
	            {
	                break;
	            }
	            if(line.substring(index, index2).contains(">")||line.substring(index, index2).contains("/"))
	            {
	                index = index2;
	                continue;
	            }
	            s2 = line.substring(index,index2);
	            if(s2.length()==0)
	            {
	                index = index2;
	                continue;
	            }            
	            index = index2+1;
	            if(IOB(index, line.length()))
	            {
	                break;
	            }
	            if(!(line.substring(index, index+1).contains("/")))
	            {
	                index--;
	                continue;
	            }
	            index++;
	            index2 = line.indexOf(">",index);
	            if(IOB(index, line.length())||(IOB(index2, line.length())))
	            {
	                break;
	            }
	            if(line.substring(index, index2).contains("<")||line.substring(index, index2).contains("/"))
	            {
	                continue;
	            }
	            s3 = line.substring(index,index2);
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


