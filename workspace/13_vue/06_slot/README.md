# 06_VueCli & Component
> 이번 챕터에서는 VueCli로 프로젝트를 생성하고 Component의 구조를 파악한다.

## VueCli
### 실행 환경
node.js 18.0 이상 버전에서 사용한다. <br>
vsCode에서 개발하며 extensions에서 Vue - Official를 설치하여 vue 파일을 인식할 수 있도록 한다. <br>
Vue - VSCode Snippets를 사용하면 단축어로 쉽게 코드 작성을 할 수 있다.

```
// vue의 최신 버전을 생성한다.
$ npm create vue@latest

// 실행 시 아래의 내용이 나온다. 전부 No 
✔ Project name: … <your-project-name>
✔ Add TypeScript? … No / Yes
✔ Add JSX Support? … No / Yes
✔ Add Vue Router for Single Page Application development? … No / Yes
✔ Add Pinia for state management? … No / Yes
✔ Add Vitest for Unit testing? … No / Yes
✔ Add an End-to-End Testing Solution? … No / Cypress / Playwright
✔ Add ESLint for code quality? … No / Yes
✔ Add Prettier for code formatting? … No / Yes

$ cd <your-project-name>

// 위 체크 항목을 package.json에 포함하고 install을 실행함.
$ npm install

// 실행시 정보가 화면에 표시되며 브라우저에 입력
$ npm run dev


```

#### 파일 정리
Vue 파일 src 하위만 설명

- ProjectName
    - src
        - assets : css 및 기타 유틸파일이 포함되어 있음 (전부 제거)
        - components : 초기 빌드시 관련된 파일이 모여있다. (폴더 내부 파일 전부제거)
        - main.js : Vue는 indext.html에 main.js를 임포트하고 main.js가 #app에 화면을 그려주는 구조이다. (css 제거 필요)
        - index.html : html을 표시할 화면이다.

## Vue Compoent
> Vue에서는 사용자가 정의한 컴포넌트와 html의 구분을 위해 PascalCase로 컴포넌트를 정의하게 된다. 이는 해당 요소가 Vue의 컴포넌트임을 명확하게 표시하고, 일반 html 요소와 구분하기 위함이다.

1.  PascalCase 첫 단어를 대문자로 시작하는 표기법이다. <br> mycomponent(x) / MyComponent(o)
2. ComponentName.vue : '.vue' 확장자를 가진 새로운 파일을 생성한다. 이는 Vue 컴포넌트를 정의하는데 사용되며 내부는 html 방식으로 인코딩되어 html과 유사하게 사용하면 된다.
3. 기본 구조 : Vue는 아래와 같이 3가지 구조를 작성한다.
    - <script> : 컴포넌트의 로직을 작성하며 컴포넌트의 상태 및 메서드 라이프 사이클과 같은 내용을 작성한다.
    - <template> : 사용자에게 보여지는 화면 요소를 정의하는 곳으로 html과 유사하게 작성되지만 Vue의 디렉티브와 컴포넌트 사용하여 동적으로 데이터를 바인딩하고 조작할 수 있다. 
    - <style scope> : 컴포넌트의 스타일을 작성하며 이 스타일은 해당 컴포넌트만 적용된다.

