package com.daxie.testspace.joglf.v2.tinter;

import com.daxie.joglf.gl.front.GLFront;
import com.daxie.joglf.gl.wrapper.GLVersion;

//JOGLFramework version:2.1.0

public class Main {
	public static void main(String[] args) {
		new Main();
	}
	public Main() {
		GLFront.Setup(GLVersion.GL4);
		
		new FadeInTestWindow().SetExitProcessWhenDestroyed();
	}
}