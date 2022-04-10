public class DuplicateElementInArray{
public static void main(String[]args){
String[]Array ={"abc","def","ghi","mno","qrs","xyz"};
for(int i=0;i<Array.length-1;i++){
for(int j=i+1;j<Array.length;j++){
if (Array[i].equals(Array[j])&&(i!=j));
{
System.out.println("Duplicate Element:"+Array[j]);
}
}
}
}
}
