
// java课本例题,供学习实验;
// 参考自课本附带代码.
// 后面会持续更新详细注释说明,有意合作请联系我.--ylin
// "我爱学习,学习也爱我."专用水印.

package Example8_3;
public class SortString {
   public static void sort(String a[]) {
      int count=0; 
      for(int i=0;i<a.length-1;i++) {
          for(int j=i+1;j<a.length;j++) { 
              if(a[j].compareTo(a[i])<0) {
                  String temp=a[i];
                  a[i]=a[j];
                  a[j]=temp;
              }
          } 
      }
   }
}

