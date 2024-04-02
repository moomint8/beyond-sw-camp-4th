<!-- vbase-3-setup -->
<template>
    <div :class="{container:true, dark: darkState}">
        props 입력: <input v-model="message"/>
        <PropsChild :message="message"/>
        <DarkMode @toggle="toggleDarkMode"/>
        <ReadProps :readValue="readValue"/>
        부모의 readValue: <input v-model="readValue"/>
    </div>
</template>

<!--
    props
    부모에서 자식 컴포넌트로 데이터를 전달하는 경우 우리는 다양한 <slot>을 이용할 수 있었다. 
    하지만 slot의 경우 컨텐츠(또는 구조)를 전달하기 위해 사용하는 것으로 단일 데이터를 전달하는 경우 적합하지 않으며
    부모에게 전달받은 데이터를 조작하는데도 어려움이 있다. 
    이러한 경우 우리는 데이터만 전달하기 위한 용도로 props를 사용할 수 있다.
    (props는 자식에게 물려주면 자식 컴포넌트는 readonly(읽기만 가능)로 써야 한다. vue는 자식 컴포넌트가 물려받은 값을
    수정해도 어차피 부모 컴포넌트에게 영향을 주지 못해서 readonly 효과가 난다.)
-->

<script setup>
    import {ref} from 'vue';
    import PropsChild from './PropsChild.vue';
    import DarkMode from './DarkMode.vue';
    import ReadProps from './ReadProps.vue';

    const message = ref('hello');
    const darkState = ref(false);
    const readValue = ref('vue는 재밌다.');

    function toggleDarkMode() {
        darkState.value = !darkState.value;
    }
</script>

<style scoped>
.container{
    border: 1px solid;
    display: flex;
    flex-direction: column;
    align-items: center;
}
.dark{
    background-color: black;
    color: white;
}
</style>