
### 외부 링크
* https://spring.io/blog/2015/06/17/devtools-in-spring-boot-1-3
* http://knight76.tistory.com/entry/spring-boot-springloaded-%EB%8C%80%EC%8B%A0-devtools
* http://zetawiki.com/wiki/%EC%8A%A4%ED%94%84%EB%A7%81%EB%B6%80%ED%8A%B8_%EB%8D%B0%EB%B8%8C%ED%88%B4%EC%8A%A4_%ED%94%84%EB%A1%9C%ED%8D%BC%ED%8B%B0
* http://jojoldu.tistory.com/43


### devtools, livereload
* http://jojoldu.tistory.com/48
1) registry 설정
ctrl + shift + a 를 누르면 IntelliJ에서 검색창이 뜨고 registry 에서 
compiler.automake.allow.when.app.running  에 체크
2) make project automatically 에 체크
3) application.properties 설정
spring.devtools.livereload.enabled = true
4) build.gradle 설정 
compile("org.springframework.boot:spring-boot-devtools")

### todo complete
* tymeleaf 익히기 (layout )




### todo
* 이미지 업로드 , 파일 업로드 
* 관리자 페이지 그누보드 처럼... 만들것!
* 사용자 페이지 webpack + vue.js 로 만들것!
* application-dev.properties , application-prod.properties 설정으로 나눌것! 
* logging ( system , db query)
* mybitis, jpa 같이 쓸수 있는 설정
* 다중 디비 연결하기










