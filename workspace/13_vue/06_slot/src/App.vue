
<!--
  컴포넌트의 lifeCycle hooks를 사용하는 방식은 2가지가 있으며
  아래의 정리된 방법과 <script setup>으로 script를 setup 지시문으로 추가하여
  hooks를 바로 사용할 수 있다.
-->
<script setup>

  import MyComponent from './components/01_component/MyComponent.vue';
  import SlotParent from './components/02_slotintro/SlotParent.vue';
  import NamedParent from './components/03_slotnamed/NamedParent.vue';
  import DynamicParent from '@/components/04_dynamicslot/DynamicParent.vue';
</script>

<!--
  vue는 사용자의 화면에 보여지는 부분을 내보낼 때 다음과 같이 <template> 하위에 구성하여 작성한다.
  template은 다른 엘리먼트 요소를 감싸주는 역할을 수행하며 사용자의 화면에 렌더링될 때 제거된다.
  (하나의 컴포넌트가 화면에 어떻게 보여질지 컴포넌트 단위의 html이 작성된다고 볼 수 있다.)
-->
<template>
  <header>
    <P>Hello!</P>
    <MyComponent/>
  </header>

  <main>
    <SlotParent/>
    <NamedParent/>
    <DynamicParent/>
  </main>
</template>

<!-- 현재 컴포넌트에서만 적용되는 스타일을 작성한다.(범위 CSS(scoped 적용)) -->
<!-- <style scoped>

</style> -->
