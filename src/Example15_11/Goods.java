
// java课本例题,供学习实验;
// 参考自课本附带代码.
// 后面会持续更新详细注释说明,有意合作请联系我.--ylin
// "我爱学习,学习也爱我."专用水印.

package Example15_11;
public class Goods implements java.io.Serializable {
   String name, mount,price;
   public void setName(String name) {
      this.name=name;
   }
   public void setMount(String mount) {
      this.mount=mount;
   }
   public void setPrice(String price) {
      this.price=price;
   }  
   public String getName() {
      return name;
   }
   public String getMount() {
      return mount;
   }
   public String getPrice() {
      return price;
   } 
}

