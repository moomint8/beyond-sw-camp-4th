<template>
    <div>
        <h1>QueryString</h1>
        <h2>currentRoute = {{ currentRoute.query }}</h2>
        <h2>name: {{ currentRoute.query.name }}</h2>
        <h2>age: {{ currentRoute.query.age }}</h2>
    </div>
</template>

<script setup>
    import {useRoute} from 'vue-router'

    const currentRoute = useRoute();
</script>

<style scoped>

</style>