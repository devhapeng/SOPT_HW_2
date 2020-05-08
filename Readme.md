
과제 2_1

> 오류
1. fragment 생성 시 include fragment factory methods? 를 해제했다고 했는데, 버전이 달라서 그런지 불필요한 메소드가 생성되어 앱이 열리지 않는 오류가 발생했다.

해결) onCreateView onViewCreated 을 제외한 메소드를 지우기

2. TODO~ 이부분을 제대로 지우지 않아서 프래그먼트 이동 시에 앱이 꺼졌다.
TODO의 기능을 아직 모르지만 지웠더니 해결되었다.

recyclerView

fragment

adapter


과제 2_2

> itemDecoration

RecyclerView 내부에 있는 추상 클래스로 RecyclerView 내의 item을 꾸밀 때 사용한다.

보통 divider 기능으로 주로 사용한다.

my_fragment.addItemDecoration(DividerItemDecoration(this, LinearLayoutManager.HORIZONTAL)) 을 추가하면 된다.

적용 ) HomeFragment에 rv_home.addItemDecoration(DividerItemDecoration(context, LinearLayoutManager.HORIZONTAL))를 추가하였는데,
앱 실행은 잘 되지만 변화를 모르겠다.


> clipToPadding

clipToPadding = true 일 때, 다음 아이템이 아래 padding 값에 의해 잘린다.
그러나, false이면 다음 아이템이 잘리지 않고 보인다.

recyclerView를 다룰때 최상단이나 하단에 여백을 두어, 다른 뷰와 구분을 주고 싶은 경우
padding을 그냥 주면
스크롤 시에 padding 공간만큼 스크롤 영역이 작다.

>> clipToPadding이라는 속성값을 이용하면 스크롤 영역을 유지한 채 여백을 줄 수 있다.

사용) RecyclerView에 android : clipToPadding = "false"을 쓰면 스크롤 영역 유지 가능.
true 값은 스크롤 영역 작아짐.


+추가) 디자인을 위한 기능으로도 사용 가능

"그림자" 기능

app : cardElevatio = "~" / elevation = "~"을 사용하여 그림자 생성 가능.
근데 그림자가 뚝 잘린 느낌이라서 예쁘지 않다.

그때 사용하는 것이 clipToPadding
android : clipToPadding = "false"을 쓰면 그림자 안잘림.

출처 : https://namooplus.tistory.com/11



>질문 사항 2_1
TODO에 대한 내용은 나중에 배우나요?

>질문 사항 2_2
itemDecoration을 HomeFragment에 rv_home.addItemDecoration(DividerItemDecoration(context, LinearLayoutManager.HORIZONTAL))를 추가하였는데,
앱 실행은 잘 되지만 코드가 적용이 제대로 된 건지 판단이 되지 않는다.

>질문 사항 기타
자바를 코틀린으로 변형 시키는 방법이나 예시를 세미나 전 수업이나 기타 수업 혹은 스터디로 진행해주실 수 있나요?
엄청 도움이 될 것 같습니다

