<template>
    <div class="container">
        <h1>Parents: {{ count }}</h1>
        <Child/>
    </div>
</template>

<!--
    Props Drilling
    상위 컴포넌트에서 하위 컴포넌트로 데이터를 전달하는 과정에서 중간에 여러 컴포넌트를 거쳐가는 경우를 말한다.
    이렇게 여러 컴포넌트를 거쳐 props를 전달하는 것은 코드를 복잡하게 만들고 유지보수를 어렵게 만들 수 있기 때문에
    vue에서는 필요한 부모 컴포넌트 하위의 컴포넌트에서 필요 시 inject하여 어디서든 사용할 수 있으며 이를 통해
    drilling을 최소화 할 수 있다.(다만 하위 컴포넌트가 많지 않을 때는 되려 유지보수에 악영향을 줄 수도 있다.)
-->

<script setup>
    import {provide, ref, readonly} from 'vue';
    import Child from './DrillingChild.vue';

    const count = ref(0);
    provide('count', count);    // provide를 통해 별도의 공간에 count 반응형 변수 값을 'count'라는 이름으로 담아 둠
    provide('count', readonly(count));  // provide를 활용하는 부모 컴포넌트에서는 수정하지만 inject를 활용하는 곳은
                                        // 읽기 전용으로 작성할 수 있다.(권장)
</script>

<style scoped>
    .container {
        border: 1px solid;
        display: flex;
        flex-direction: column;
        align-items: center;
    }
</style>