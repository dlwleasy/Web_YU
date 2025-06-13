
# JobStack

JobStack은 취업 준비생을 위한 종합 진로 관리 플랫폼입니다. Spring Boot 기반으로 개발된 이 웹 애플리케이션은 취업 준비에 필요한 다양한 도구와 정보를 한 곳에서 제공합니다.

```
 문제가 발생하여 실행이 안될경우 연락주세요.
실행이 안된다면 **실행결과**를 참고해주세요!! :)

```
[실행결과](https://youtu.be/mavMFM75pO8?si=qKTfenF1Tf2Yl3lT)
오류페이지의경우 - 이미 회원으로 등록한경우 뜨는것! 

## 주요 기능

### 1. 사용자 관리 시스템
- 회원가입 및 로그인
- Spring Security를 통한 보안 인증

### 2. 자기 이해 및 관리 
- 홀랜드 검사 연동
- MBTI 성격 유형 검사 연동
- 자기 분석 도구 제공 및 글 제공 

### 3. 채용 정보 통합
- 다양한 채용 사이트 정보 제공
  - 잡코리아
  - 사람인
  - 원티드
  - 슈퍼루키
  - 점핏
  - 잡플래닛
  - 프로그래머스
  - 로켓펀치
 
### 4. 게시판
- 질문 및 게시글 작성 가능
- 댓글등록
- 모두가 이용가능
  
### 5. UI/UX 특징
- 모던하고 직관적인 디자인
- 반응형 웹 디자인
- 부드러운 애니메이션 효과
- 그라데이션을 활용한 시각적 효과






## 필수 요구사항

프로젝트를 실행하기 위해 다음 프로그램들이 설치되어 있어야 합니다:

1. **Java 17 이상**:
   - 스프링부트 3.x 버전은 Java 17 이상에서 실행됩니다.
   - Java 버전 확인:
     ```bash
     java -version
     ```

2. **Gradle 7.0 이상**:
   - Gradle은 스프링부트 프로젝트를 빌드하고 실행하는 데 필요한 빌드 도구입니다.
   - Gradle 버전 확인:
     ```bash
     gradle -v
     ```

3. **IntelliJ unlitmate**:
   - IntelliJ IDEA는 스프링부트 애플리케이션을 개발하는 데 유용한 IDE입니다.
   - [IntelliJ IDEA 다운로드](https://www.jetbrains.com/idea/)

4. **Git (필수)**:
   - Git은 프로젝트를 클론하는 데 사용됩니다. [Git 다운로드 링크](https://git-scm.com/)에서 설치하세요.

## 프로젝트 설정 및 실행 방법

### 1. 프로젝트 클론
먼저, Git을 사용하여 프로젝트를 클론합니다. 아래 명령어를 사용하여 저장소를 클론하세요:

```bash
git clone [your-repository-url]
cd jobstack
````

### 2. Gradle 빌드

Gradle을 사용하여 프로젝트를 빌드합니다. 아래 명령어를 실행하세요:

```bash
./gradlew build
```

Windows 환경에서는 다음 명령어를 사용하세요:

```bash
gradlew.bat build
```

또는, **IntelliJ IDEA**에서 Git URL을 붙여넣고, Gradle을 실행한 후 `JobStackApplication.java` 파일을 실행하면 됩니다.

### 3. 애플리케이션 실행

Gradle을 사용하여 애플리케이션을 실행합니다. 아래 명령어를 입력하세요:

```
JobStackApplication.java파일에서 실행버튼을 눌러도 됩니다.
```

```bash
./gradlew bootRun
```

Windows 환경에서는 다음 명령어를 사용하세요:

```bash
gradlew.bat bootRun
```



### 4. 웹 애플리케이션 접속

애플리케이션이 실행되면, 브라우저에서 아래 주소로 접속하여 웹 애플리케이션을 확인할 수 있습니다:

```
http://localhost:8080/home
```

## 문제 해결

### 빌드 오류 발생 시

1. **Gradle 래퍼 재설치**:

   ```bash
   gradle wrapper
   ```

2. **Gradle 캐시 삭제**:

   ```bash
   ./gradlew clean
   ```

### 포트 충돌 발생 시
*되도록이면 다른 프로세스를 종료시켜주세요*

* `8080` 포트가 이미 다른 프로세스에서 사용 중일 수 있습니다. 이 경우, 포트를 종료하거나 다른 포트를 사용하도록 설정을 변경합니다. `application.properties` 파일에 아래 설정을 추가하여 다른 포트를 사용하게 할 수 있습니다:

  ```properties
  server.port=8081
  ```

### 잘못된 HTTP 요청 오류 발생 시

* `Invalid character found in method name` 오류는 잘못된 HTTP 요청을 보낸 경우 발생합니다. 이는 주로 잘못된 브라우저 요청 또는 비정상적인 클라이언트 요청에 의해 발생합니다.
* `application.properties` 파일에 아래 설정을 추가하여 더 자세한 디버깅 정보를 얻을 수 있습니다:

  ```properties
  logging.level.org.apache.coyote.http11=DEBUG
  logging.level.org.springframework=DEBUG
  ```

## IntelliJ IDEA에서 Gradle 설정 방법

1. **Gradle 설정**:

   * IntelliJ IDEA에서 **File > Settings** (또는 macOS의 경우 **IntelliJ IDEA > Preferences**)을 열고, `Build, Execution, Deployment > Build Tools > Gradle`을 선택합니다.
   * `Gradle settings`에서 Gradle을 **자동으로 다운로드**하도록 설정하세요. 이렇게 하면 프로젝트를 처음 실행할 때 필요한 Gradle 버전이 자동으로 다운로드됩니다.

2. **Java SDK 설정**:

   * 프로젝트가 실행될 Java 버전을 IntelliJ IDEA에서 설정합니다.
   * **File > Project Structure > Project**에서 **Project SDK**를 `Java 17` 이상으로 설정하세요.
   * `JobStackApplication.java` 파일에서 실행할 Java 버전이 `17 이상`인지 확인하세요.

3. **프로젝트 실행**:

   * **Run** 메뉴에서 `Run 'JobStackApplication'`을 클릭하거나 `Shift + F10`을 눌러 애플리케이션을 실행하세요.

## 기술 스택

* **Spring Boot**: Java 기반의 웹 애플리케이션 개발 프레임워크
* **Spring Security**: 애플리케이션의 보안 인증 및 권한 관리를 위한 라이브러리
* **Spring Data JPA**: 데이터베이스와 객체를 매핑하는 ORM(Object Relational Mapping) 기술
* **Lombok**: 반복적인 코드 생성을 줄여주는 라이브러리 (예: Getter, Setter, Constructor 자동 생성)
* **Gradle**: 프로젝트 빌드 도구



