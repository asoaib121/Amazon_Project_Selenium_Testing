package Amazon.annotations;

import org.testng.annotations.Test;
import java.lang.reflect.Method;

public class AnnotationsTest {
    @Test(description="checking whether the parameter is accessible via reflection at runtime")
    public void testingTest(Method m){
         System.out.println(m.getAnnotation(Test.class).description());
    }
}
