#전화번호부

dict_1={
    '김범준' : ['김범준', '서울대학교', '경영학과', '01024224684'],
    '김지은' : ['김지은', '이화여자대학교', '컴퓨터공학과', '01082475938'],
    '안주은' : ['안주은', '한양대학교', '정보시스템학과', '01047129438'],
    '민영기' : ['민영기', '서울대학교', '기계항공공학부', '01035068433'],
    '이상흔' : ['이상흔', '서울대학교', '중어중문학과', '01082427753'],
    '서성욱' : ['서성욱', '서울대학교', '기계항공공학부', '01099196919'],
    '이상흔' : ['이상흔', '서울대학교', '중어중문학과', '01082427753'],
    '민영기' : ['민영기', '서울대학교', '기계항공공학부', '01035068433'],
    '서성욱' : ['서성욱', '서울대학교', '기계과', '01099196919'],
    '김원빈' : ['김원빈', '서울대학교', '경영학', '01034407808'],
    '박연준' : ['박연준', '서울대학교', '에너지자원공학', '01036218127'],
    '이현인' : ['이현인', '서울대학교', '기계항공공학부', '01051850339'],
    '고희원' : ['고희원', '이화여자대학교', '컴퓨터공학', '01041784750'],
    '이경연' : ['이경연', 'KAIST', '산업디자인', '01063591807'],
    '최이준' : ['최이준', '한양대학교', '정보시스템학', '01092759880'],
    '김지훈' : ['김지훈', '한양대학교', '정보시스템', '01074841399'],
    '공현택' : ['공현택', '한양대학교', '정보시스템', '01082338681'],
    '김현중' : ['김현중', '한양대학교', '정보시스템학', '01075114389'],
    '이혜린' : ['이혜린', '한양대학교', '정보시스템학', '01066443179'],
    '이영은' : ['이영은', '한양대학교', '정보시스템학', '01064006655'],
    '오슬기' : ['오슬기', '서울대학교', '경영학', '01042103117'],
    '김병재' : ['김병재', '서울대학교', '산업인력개발학', '010-9901-7807'],
    '한민호' : ['한민호', '서울대학교', '경제학', '010-2597-4805'],
    '황서영' : ['황서영', 'KAIST', '산업및시스템공학과', '010-3342-7175'],
    '배주혁' : ['배주혁', '한양대학교', '정보시스템학', '010-7245-4120'],
    '권진환' : ['권진환', '서울대학교', '경제학', '010-4546-7992'],
    '전민규' : ['전민규', '서울대학교', '경영학과', '010-2575-4166'],
    '김유현' : ['김유현', '숙명여자대학교', '한국어문학', '01087390774'],
    '한효정' : ['한효정', '이화여자대학교', '광고홍보학', '010-2284-7722'],
    '허수정' : ['허수정', '이화여자대학교', '중어중문학', '010-2876-1041'],
    '이아영' : ['이아영', '한양대학교', '문화콘텐츠학', '010-3057-7991']
}

while True:
    name = input('피로그래밍 멤버의 이름 입력하세요')
    print(dict_1[name]) #정보 출력
    print('계속 하시겠어요?')
    answer = input()
    if answer == '네':
        continue
    else :
        break