package com.wgcloud;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

/**
 *
 * @ClassName:ApplicationContextHelper.java     
 * @version V2.3
 * @author: wgcloud     
 * @date: 2019年11月16日
 * @Description: ApplicationContextHelper.java
 * @Copyright: 2019 wgcloud. All rights reserved.
 *
 */
@Component
public class ApplicationContextHelper implements ApplicationContextAware {    
    private static ApplicationContext applicationContext;    
    @Override    
    public void setApplicationContext( ApplicationContext applicationContext1 ) throws BeansException {    
    	applicationContext = applicationContext1;    
    }  
      
    public static ApplicationContext getApplicationContext(){  
        return applicationContext;  
    }  
      
	@SuppressWarnings("unchecked")
	public static <T> T getBean(Class<T> clazz) {
		return (T) applicationContext.getBean(clazz);
	}

}