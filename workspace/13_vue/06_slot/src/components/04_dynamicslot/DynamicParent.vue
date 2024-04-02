<template>
    <div class="parentContainer">
        <h1>DynamicSlot: </h1>
        <input type="text" v-model="dynamicName">
        <DynamicChild>
            <template #[dynamicName]>
                {{ dynamicName }}
            </template>
        </DynamicChild>
    </div>
</template>

<script setup>
    import {ref} from 'vue';
    import DynamicChild from './DynamicChild.vue';

    const dynamicName = ref('');
</script>

<style scoped>
    .parentContainer {
        display: flex;
        align-items: center;
        flex-direction: column;
        border: 1px solid black;
    }
</style>