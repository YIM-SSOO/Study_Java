package java03.day05;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
// JVM 실행 시  감지할 수 있게 하려면 @Retention(RetentionPolicy.RUNTIME)을 사용한다
@Retention(RetentionPolicy.RUNTIME)
public @interface Count100 {

}
