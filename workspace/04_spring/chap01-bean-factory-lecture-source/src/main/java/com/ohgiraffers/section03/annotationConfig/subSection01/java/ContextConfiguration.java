package com.ohgiraffers.section03.annotationConfig.subSection01.java;

import com.ohgiraffers.common.MemberDAO;
import com.ohgiraffers.common.MemberDTO;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;

/* 설명.  */
/* 설명.
 *  설정용 클래스도 bean으로 관리되며 이름(bean의 id)을 부여할 수 있다.
 *  이름을 따로 부여하지 않으면 클래스명의 앞글자만 소문자로 바꾼 이름으로 부여된다.
 *  ex) ContextConfiguration -> contextConfiguration
 */
@Configuration("configurationSection03")

/* 설명. 1. 단순히 범위 지정만으로 @Component계열의 어노테이션들을 모두 bean으로 관리하는 경우 */
//@ComponentScan(basePackages = "com.ohgiraffers")

/* 설명. 2. 범위 및 필터를 적용해서 bean을 관리하는 경우 */
//@ComponentScan(basePackages = "com.ohgiraffers",
//        excludeFilters = {
//                @ComponentScan.Filter(
//
//                        /* 설명. 2-1. 타입으로 설정 */
////                        type = FilterType.ASSIGNABLE_TYPE,
////                        classes = {MemberDAO.class}
//
//                        /* 설명. 2-2. 어노테이션 종류로 설정 */
////                        type = FilterType.ANNOTATION,
////                        classes = {org.springframework.stereotype.Repository.class}
//
//                        /* 설명. 2-3. 표현식으로 설정 */
////                        type = FilterType.REGEX,
////                        pattern = "com\\.ohgiraffers\\.section03\\.annotationConfig\\.subSection01\\.java\\.*"
//                )
//
//        })

/* 설명. 3. 범위 및 필터를 적용해서 bean을 관리하는 경우 (includeFilters) */
@ComponentScan(basePackages = "com.ohgiraffers",
        useDefaultFilters = false,
        includeFilters = {
                @ComponentScan.Filter(
                        type = FilterType.ASSIGNABLE_TYPE,
                        classes = {MemberDTO.class}
                )
        })

/* 설명.
 *  @ComponentScan은 필터의 경우 개념 정도만 알아도 되지만 기본적으로 @Configuration 클래스가 위치한
 *  패키지와 해당 패키지 하위만 Scan하기 때문에 더 상위범위나 다른 패키지를 Scan하기 위해 주로 사용된다.
 */
public class ContextConfiguration {

}
