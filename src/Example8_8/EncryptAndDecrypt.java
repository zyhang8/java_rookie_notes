
// java课本例题,供学习实验;
// 参考自课本附带代码.
// 后面会持续更新详细注释说明,有意合作请联系我.--ylin
// "我爱学习,学习也爱我."专用水印.

package Example8_8;
public class EncryptAndDecrypt {   
   String encrypt(String sourceString,String password) { //加密算法
       char [] p= password.toCharArray();
       int n = p.length;
       char [] c = sourceString.toCharArray();
       int m = c.length; 
       for(int k=0;k<m;k++){
            int mima=c[k]+p[k%n];       //加密
            c[k]=(char)mima; 
       }
       return new String(c);    //返回密文
    }
    String decrypt(String sourceString,String password) { //解密算法
       char [] p= password.toCharArray();
       int n = p.length;
       char [] c = sourceString.toCharArray();
       int m = c.length; 
       for(int k=0;k<m;k++){
           int mima=c[k]-p[k%n];       //解密
           c[k]=(char)mima; 
       }
       return new String(c);    //返回明文
   }
}



