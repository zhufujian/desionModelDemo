package com.study.demo.createModel.singleton;


/**
 * 
*
* @Description: 懒汉式单例]
* 特点：类加载时没有生成单例，只有当第一次调用 getlnstance 方法时才去创建这个单例
* 优点：两个关键字就能保证线程安全
* 缺点：是每次访问时都要同步，会影响性能，且消耗更多的资源
* @ClassName: LazySingleton 
* @author zhufj
* @date 2019年1月7日 下午5:15:09 
*
 */
public class LazySingleton
{
    private static volatile LazySingleton instance=null;    //保证 instance 在所有线程中同步
    private LazySingleton(){
    	
    	System.out.println("this is LazySingleton");
    }    //private 避免类在外部被实例化
    public static synchronized LazySingleton getInstance()
    {
        //getInstance 方法前加同步
        if(instance==null)
        {
            instance=new LazySingleton();
        }else{
        	
        	System.out.println("LazySingleton is exist");
        }
        return instance;
    }
}
