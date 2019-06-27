import React from 'react';
import { storiesOf, action, linkTo } from '@kadira/storybook';

import DragDropContextMock from './mock/DragDropContextMock';

import Card from '../components/Scheduling/ShiftWeekTable/Section/Row/Card';

storiesOf('Card')
  .add('default', () => {
    return (
      <DragDropContextMock>
        <Card
          columnId={'42'}
          timezone={'America/Los_Angeles'}
          shiftStart={'2016-01-01'}
          shiftStop={'2016-01-01'}
          shiftId={'42'}
          jobId={'42'}
          userId={'42'}
          viewBy={'yolo'}
          employees={{}}
          jobs={{}}
          deleteTeamShift={() => {}}
          toggleSchedulingModal={() => {}}
          modalFormData={() => {}}
          updateSchedulingModalFormData={() => {}}
          clearSchedulingModalFormData={() => {}}
          editTeamShift={() => {}}
          published={false}
        />
      </DragDropContextMock>
    );
  });
