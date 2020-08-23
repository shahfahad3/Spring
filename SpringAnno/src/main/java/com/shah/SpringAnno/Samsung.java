package com.shah.SpringAnno;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
@Component
public class Samsung {
		@Autowired
		@Qualifier("snapDragon")//Made the Snapdragon class Primary
		MobileProcessor cpu;
		
	public MobileProcessor getCpu() {
			return cpu;
		}

		public void setCpu(MobileProcessor cpu) {
			this.cpu = cpu;
		}


	public void config() {
		System.out.println("Octa Core, $gb Ram, 12MP Camera");
		cpu.process();
	}
}
