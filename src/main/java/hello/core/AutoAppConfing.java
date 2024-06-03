package hello.core;

import hello.core.member.MemberRepository;
import hello.core.member.MemoryMemberRepository;
import org.springframework.context.annotation.*;

@Configuration
@ComponentScan(
        //디폴트는 hello.core
        //basePackages = "hello.core.member",
        //basePackageClasses = AutoAppConfing.class,
        excludeFilters = @ComponentScan.Filter(type = FilterType.ANNOTATION, classes = Configuration.class)
)
public class AutoAppConfing {
    @Bean(name = "memberRepository")
    MemberRepository memberRepository(){
        return new MemoryMemberRepository();
    }
}
