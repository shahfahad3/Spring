/**
 * 
 */
package com.shah.SpringAnno;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

/**
 * @author hppc
 *
 */
@Component
//Make it primary 
//@Primary
public class MediaTek implements MobileProcessor {

	public void process() {
		System.out.println("World Second Best");

	}

}
