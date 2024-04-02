<template>
    <h3>GrandChild: {{ injectCount }}</h3>
    <button @click="injectCount++">GrandChild가 증가(수정)</button>
</template>

<script setup>
    import {inject} from 'vue';

    const injectCount = inject('count');
</script>
