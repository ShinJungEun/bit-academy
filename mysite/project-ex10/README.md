# React Component - Styling(CSS Module 적용하기)

<pre>
1.
mkdir project-ex010
cd project-ex010

2. 
npm i -D webpack webpack-cli webpack-dev-server style-loader css-loader react react-dom @babel/core babel-loader @babel/preset-env @babel/preset-react 

3.
project-ex07의 src, public, webpack.config.js, babel-config.json 복사

4.
npm scripting 적용(package.json)
 "build": "npx webpack",
 "start": "npx webpack-dev-server"


5.
애플리케이션 작성 
App.js
App.css

Banner01.js
Banner01.css
Banner02.js
Banner02.css

6.
App.css 파일 작성

7.
style-loader, css-loader 설치
npm i -D style-loader css-loader

8.
css-loader에 CSS Moudule 설정(webpack.confing.js)

9.
개발 서버 실행 및 확인
npm start
</pre>