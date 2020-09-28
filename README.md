# Wifi-Collector

주변 Wi-Fi 신호를 실시간으로 수집하는 안드로이드 어플리케이션

## 제약 사항

- Minimum SDK는 Android 4.1 (API 16) 입니다.

- 2분 간격으로 4회 스캔 가능합니다. 기본적으로 배터리 절약을 위해 스캔에는 횟수 제한이 걸려있지만, `개발자 옵션 > 네트워크 > Wi-Fi 스캔 쓰로틀링 옵션`을 On하면 위 사용 제한을 해제할 수 있습니다ㅣ

## 기능

1. 와이파이 정보 확인

- 와이파이의 이름과 MAC address(BSSID) 및 시각화된 신호 세기를 확인 가능

2. 화면 스크롤 기능

- `RecyclerView`를 활용하여 리스트의 항목이 길어질 경우 화면 스크롤 가능

3. 출력 결과 정렬

- 현재 위치 기반으로 와이파이를 검색하는 `WifiManager`를 활용하였기 때문에, 출력되는 와이파이 리스트는 기본적으로 **신호 세기**를 기준으로 정렬

## 스크린샷

<div>
<img width="250" src="https://user-images.githubusercontent.com/46990061/94396208-6a026580-019c-11eb-84a5-cc750199b113.jpg">
</div>
