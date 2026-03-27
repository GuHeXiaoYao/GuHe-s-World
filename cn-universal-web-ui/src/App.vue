<template>
  <a-config-provider :locale="locale">
    <div id="app">
      <router-view/>
      <Resizabler ref="resizabler"/>
    </div>
  </a-config-provider>
</template>

<script>
import {domTitle, setDocumentTitle} from '@/utils/domUtil'
import {i18nRender} from '@/locales'
import Resizabler from '@/views/dashboard/components/Resizabler.vue'

export default {
  components: {Resizabler},
  computed: {
    locale() {
      const {title} = this.$route.meta
      title && (setDocumentTitle(`${i18nRender(title)} - ${domTitle}`))

      return this.$i18n.getLocaleMessage(this.$store.getters.lang).antLocale
    }
  },
  mounted() {
    this.$bus.$on('resizeabler', (queryName) => {
      this.$refs.resizabler.open(queryName)
    })
  }
}
</script>
