<!-- vbase-3-setup -->
<template>
    <div>
        <h1>MyComponent</h1>
    </div>
</template>

<script>
  import {onMounted} from 'vue';

  export default {
    setup() {
      onMounted(async() => {
        console.log("Hello! Vue~~!");
      })
    }
  }
</script>

<style scoped>

</style>