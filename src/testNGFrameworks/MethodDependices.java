package testNGFrameworks;

import org.testng.annotations.Test;

public class MethodDependices {
	    @Test
		public void a_startcar() {
		System.out.println("car stated");

		}
		        @Test(dependsOnMethods="f_fourthgear")
		public void b_turnonmusic() {
		System.out.println("music oned");

		}
		      @Test
		public void c_firstgear() {
		System.out.println("1 gear");

		}
		          @Test
		public void d_secondgear() {
		System.out.println("2 gear");

		}
		      @Test
		public void e_thridgear() {
		System.out.println("3 gear");

		}
		       @Test
		public void f_fourthgear() {
		System.out.println("4 gear");

		}

}
