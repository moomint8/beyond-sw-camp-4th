<!-- vbase-3-setup -->

<!--
    namedSlot
    슬롯은 부모에서 자식 컴포넌트로 컨텐츠를 전달할 수 있지만 여러개의 콘턴츠를 전달할 수 없었다.
    이 문제를 해결하기 위해 NamedSlot을 사용하게 되는데 NamedSlot은 부모 컴포넌트에서 자식 컴포넌트로
    여러 개의 콘텐츠(구조)를 전달할 때 슬롯에 특정 이름을 명시하여 바인딩 하는 방식으로 전달하게 된다.
-->
<template>
    <div class='container'>
        <h1>NamedSlot</h1>
        <NamedChild>
            <template v-slot:name>
                <h2>
                    name: {{obj.name}}
                </h2>
            </template>

            <!-- 아래와 같이 v-slot을 축약식(#)으로 표현도 가능하다. -->
            <template #founder>
                <p>founder: {{ obj.founder }}</p>
            </template>
            <template v-slot:img>
                <img :src="obj.img"/>
            </template>
        </NamedChild>
    </div>
</template>

<script setup>
    import { reactive } from 'vue';
    import NamedChild from './NamedChild.vue';

    const obj = reactive({
        name: "vue",
        founder: "Evan You",
        img: "https://images.ctfassets.net/s5uo95nf6njh/2fEr6ctL9FxPtOPhUcM4FA/773007e573bfa16aebdb736f767b45fa/evan-you-hero.jpg"
    });
    
</script>

<style scoped>
   .container {
    display: flex;
    flex-direction: column;
    align-items: center;
    border: 1px solid black;
   }
   img {
    width: 200px;
    height: 200px;
   }
</style>