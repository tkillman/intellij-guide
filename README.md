# markdown
0. 줄바꿈
```
   (문장 마지막 스페이스 3번)
   <br/>
```

***
1. 글씨크기
# this is letter
## this is letter
### this is letter
#### this is letter
##### this is letter
###### this is letter
***

2. BlockQuote
> akgj
> > ajsf
> >> akdjf
> >>> akdsjf
*** 

3. 순서없는목록
* A
* B
* C

***
4. 코드블럭
```
    this is code block
```
***

5. 수평선 (별표 3개)
***

6. 링크

Link : [Google](http://www.google.com)
```
    [Title](url)
```

***

7. 강조  
   *강조*  
   **강조1**

***

8. 이미지
```
![이미지](url)
```
a. 해당 프로젝트의 github를 간다.   
b. issue 탭의 write로 파일을 드래그 드롭으로 생성한다.   
c. edit 버튼으로 해당 url을 복사한다.   
추가 팁 : b단계의 이미지 업로드는 github의 소스내에 두어도 되고 다른곳의 img url이여도 무관하다.

# ide-study

##목차
###소개
#### 
* Toolbox 소개
> Link : [JetBrain](https://www.jetbrains.com/ko-kr/)   
toolbox를 사용하면 버전업데이트나 메모리 관리를 편하게 해준다.

* 프로젝트 생성
> 왠만하면 gradle이나 maven 모듈로 프로젝트를 만들어준다.   
gradle 프로젝트 생성 groupid : com.jojodu.influen , Artifectid : intellij-guide

###코드 Edit
####
* 메인메소드 생성 및 실행
> 1. 메인메소드를 만들어본다   
> 신규생성 : alt + insert
> 실행 : ctrl + shift + f10

* 라인 수정하기
>1.라인복제하기 : ctrl + D   
>2.라인삭제하기 : ctrl + Y   
>3.문자열라인합치기 : ctrl + shift + j   
>4.라인단위로 옮기기(문법 내 이동가능) : ctrl + shift + up/down  
>5.라인단위로 옮기기(문법과 상관없이 옮기기) : alt + shift + up/down   
>6.element단위로 옮기기 : ctrl + alt + shift + left/right   

* 코드 즉시보기
>1.인자값 즉시보기 : ctrl + p   
>2.코드구현부 보기 (무료 : java, 유료 : javascript, css): shift + ctrl + i
>3.Doc 즉시보기 : ctrl + q

### 포커스
####
* 포커스 에디터
>1.단어별 이동 : ctrl + left/right   
>2.단어별 선택 : ctrl + shift + left/right   
>3.라인 첫/끝이동 : Home, End   
>4.라인 전체선택 : Shift + Home,End   
>5.Page up/down : PageUp/PageDown   

* 포커스 특수키
>1.포커스범위 한 단계식 늘리기 : ctrl + w   
> 2.포커스 뒤로/앞으로 가기 : ctrl + alt + left/right   
> 3.멀티 포커스 : ctrl + ctrl + 아래   
> 4.오류 라인으로 자동 포커스 : F2

###검색
####
* 검색텍스트
> 1.현재 파일에서 검색 : ctrl + f   
> 2.현재 파일에서 교체 : ctrl + r   
> 3.전체에서 검색 : ctrl + shift + f   
> 4.전체에서 교체 : ctrl + shift + r   
> 5.정규표현식으로 검색, 교체 : ctrl + shift + regex 클릭

* 검색 기타
> 1.파일검색 : shift + ctrl + n   
> 2.메소드 검색 : shift + ctrl + alt + n   
> 3.Action 검색 : shift + ctrl + a   
> 4.최근 열었던 파일 목록 보기 : ctrl + e   
> 5.최근 수정한 파일 목록 보기 : ctrl + shift + e   

### * 자동완성
####
* 자동완성
> 1.스마트 자동완성 : ctrl + shift + space   
> 2.스태틱 메소드 자동완성 : ctrl + space 두번   
> 3.Getter/Setter/생성자 자동완성 : alt + insert   
> 4.Overrider method 자동완성 : ctrl + i   

* Live Template
> 1.Live Template 소개 : ctrl + j    
> 2.Live Template 추가하기
> > a.ctrl + shift + a 에서 Live Template 입력 후 선택

### * 리팩토링
####
* 리팩토링 Extract
> 1.변수 추출하기  : ctrl + alt + v   
> 2.파라미터 추출하기 : ctrl + alt + p   
> 3.메소드 추출하기 : : ctrl + alt + m   
> 4.이너클래스 추출하기 : F6

* 리팩토링 기타
> 1.이름 일괄 변경하기 : shift + f6   
> 2.타입 일괄 변경하기 : ctrl + shift + f6   
> 3.Import 정리하기 : ctrl + alt + o,   
>> shift + ctrl + a optimize import on 검색 후
>> on 하게되면 자동 시 자동으로 import 제어   
> 
> 4.코드 자동 정렬하기 : ctrl + alt + l

### 디버깅
####
* 디버깅


### git & github
####
* git
> 1.git view on : alt + 9   
> 2.git option popup : alt + `(tab 위에 버튼)   
> 3.git history : alt + `(tab 위에 버튼) => 4   
> 4.Branch : alt + `(tab 위에 버튼) => 7   
> 5.commit : ctrl + k   
> 6.push : ctrl + shift + k   
> 7.pull은 별도 단축키가 없다. : ctrl + shift + a 로 pull 옵션을 찾는다.
> 

* github
> 1.Github 연동하기 : ctrl + shift + a => share github
> 2.github clone : main에서 check out from version control 선택
> 
### plugin
####
* plugin
> 1.플러그인 설치   
> 2.추천 플러그인
> 

