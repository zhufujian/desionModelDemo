package com.study.demo.createModel.singleton;

/**
 * 
*
* @Description: 饿汉式单例
* 特点：类一旦加载就创建一个单例，保证在调用 getInstance 方法之前单例已经存在了
* 优点:在类创建的同时就已经创建好一个静态的对象供系统使用，以后不再改变，所以是线程安全的，可以直接用于多线程而不会出现问题
* @ClassName: HungrySingleton 
* @author zhufj
* @date 2019年1月7日 下午5:16:31 
*
 */
public class HungrySingleton
{
    private static final HungrySingleton instance=new HungrySingleton();
    private HungrySingleton(){}
    public static HungrySingleton getInstance()
    {
    	if(instance==null){
    		System.out.println("HungrySingleton is null");
    	}else{
    		System.out.println("this is HungrySingleton");
    	}
        return instance;
    }
}
