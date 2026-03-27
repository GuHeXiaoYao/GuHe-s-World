/**
 * ��ĿĬ��������
 */

export default {
  navTheme: 'light',
  menu: {
    locale: true
  },
  title: 'IoT Connector',
  siderMenu: {
    collapsedTitle: 'IoT Connector',
    expandedTitle: 'IoT Connector',
    wideScreenTitle: '�������豸����',
    wideScreenBreakpoint: 1280
  },
  pwa: false,
  iconfontUrl: '',
  production: process.env.NODE_ENV === 'production'
    && process.env.VUE_APP_PREVIEW !== 'true',
  tableSize: 'middle',
  layout: 'sidemenu',
  contentWidth: 'Fluid',
  theme: 'light',
  primaryColor: '#2f54eb',
  fixedHeader: false,
  fixSiderbar: false,
  multiTab: true,
  hideHintAlert: true,
  hideCopyButton: false
}
